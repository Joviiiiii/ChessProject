import java.util.Map;
import java.util.Scanner;

public class Player {
    ChessColor color;
    public static final Map<Character, Integer> inputMap = Map.of('a', 0, 'b', 1,'c', 2, 'd' ,3,'e',4,'f',5,'g',6,'h',7);
    public Player(ChessColor color){
        this.color = color;
    }

    public Move getMove(String string){
        char startX = string.charAt(0);
        char startY = string.charAt(1);
        char endX = string.charAt(3);
        char endY = string.charAt(4);
        int startXInt = inputMap.get(startX);
        int startYInt = Integer.parseInt(String.valueOf(startY))-1;
        int endXInt = inputMap.get(endX);
        int endYInt = Integer.parseInt(String.valueOf(endY))-1;
        return new Move(startXInt, startYInt, endXInt, endYInt, this.color);
    }
    public Move getInput(Board board){
        int startX;
        int startY;
        int endX;
        int endY;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the piece you want to move and where to move it. eg: a1 b2");
        String input = scanner.nextLine();
        while (!inputIsValid(input, board)) {
            System.out.println("Input was not valid");
            input = scanner.nextLine();
        }
        return getMove(input);
    }

    public boolean inputIsValid(String input, Board board){

        if(input.length() != 5){
            return false;
        }

        char startX = input.charAt(0);
        char startY = input.charAt(1);
        char endX = input.charAt(3);
        char endY = input.charAt(4);

        if (!inputMap.containsKey(startX) || !inputMap.containsKey(endX)){
            return false;
        }
        int startYInt;
        int endYInt;
        try{
            startYInt = Integer.parseInt(String.valueOf(startY));
            endYInt = Integer.parseInt(String.valueOf(endY));
        } catch (NumberFormatException e) {
            return false;
        }


        if (inputMap.containsValue(startYInt - 1) && inputMap.containsValue(endYInt - 1)){
            int startXInt = inputMap.get(startX);
            if (board.getPiece(startXInt,startYInt-1) != null){
                return true;
            }
        }
        return false;
    }


}
