import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Robot {

    char[][] map;
    int count = 0;
    int[] coorX = new int[100]; //X coordinates
    int[] coorY = new int[100]; //Y coordinates

    final char VISITED = '0';
    final char WALL = 'W';
    final char DANGER = 'X';


    public void readFile() {

        System.out.print("Enter a map file: ");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.next();
        try {
            File file = new File(fileName);
            Scanner fileScan = new Scanner(file);
            int cols = fileScan.nextInt(); //Saves number of columns
            int rows = fileScan.nextInt(); //Saves number of rows
            map = new char[rows][cols];
            for (int row = 0; row < rows; row++) {
                String line = fileScan.next(); //reads in the next line of the map
                for (int col = 0; col < cols; col++) {
                    map[row][col] = line.charAt(col);
                    System.out.print(line.charAt(col));
                }
                System.out.println();
            }
            fileScan.close();
        } catch (IOException e) {
            System.out.print("map file not formatted correctly\n");
        }
    }

    public static void main(String[] args) {
        Robot rb = new Robot();
        rb.start();
        rb.printX();
    }

    private void start() {
        readFile();
        traverse(1, 1); //Start at (1, 1)
    }

    private void traverse(int x, int y) {
        if (map[x][y] != WALL) {
            if (map[x][y] != VISITED) {
                if (map[x][y] == DANGER) {
                    coorX[count] = x;
                    coorY[count] = y;
                    count++;
                }
                map[x][y] = '0';

                traverse(x, y + 1); //Move East
                traverse(x + 1, y); //Move South
                traverse(x, y - 1);  //Move West
                traverse(x - 1, y);  //Move North
            }
        }
    }

    public void printX() {
        System.out.println();
        System.out.println("Pieces of dangerous luggage found: " + count);
        for (int i = 0; i < coorX.length; i++) {
            if (coorX[i] != 0 && coorY[i] != 0) {
                System.out.println("Locations of dangerous luggage: (" + coorX[i] + " " + coorY[i] + ")");
            }
        }
    }

}
