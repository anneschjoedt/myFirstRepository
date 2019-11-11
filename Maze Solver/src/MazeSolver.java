import java.util.LinkedList;

/**
 * MazeSolver
 */
public class MazeSolver {

    static int [][] maze = {
        {2, 0, 1, 1},
        {1, 1, 0, 1},
        {0, 1, 1, 1}
    };
    // 0 = wall
    // 1 = path
    // 2 = destination

    static LinkedList<Position> path = new LinkedList<>();

    public static void main(String[] args) {
        // y = row, x = column
        Position p = new Position(0,3);
        path.push(p);

        int y = path.peek().y;
        int x = path.peek().x;

        // peek (look) at the most recent position in our path and mark that as zero
        maze[y][x] = 0;

        while(true) {
            //down 
            if(maze[y+1][x] == 2) {
                System.out.println("You won!");
                return;
            } else if(maze[y+1][x] == 1) {
                System.out.println("Moved down");
                path.push(new Position(y+1, x));
                continue;
            }
        }
        
    }
}