import java.util.Arrays;

public class Grader {
    String name;
    String desc;
    int[] pts;
    String[] sols;

    public Grader(String name, String desc, int[] pts, String[] sols) {
        this.name = name;
        this.desc = desc;
        this.pts = Arrays.copyOf(pts, pts.length);
        this.sols = Arrays.copyOf(sols , sols.length);
    }
    
}
