package exe10.Util;

public class Invert {
    private Integer base = 0;

    public Integer calc(Integer i){
        while (i != 0){
            int d = i %10;
            base = base * 10 + d;
            i /= 10;
        }
        return base;
    }
}
