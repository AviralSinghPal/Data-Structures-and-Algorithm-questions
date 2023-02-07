public class recursion {
    public static int mazepath(int sr,int sc, int er, int ec, String path) {
        if (sr == er && sc == ec) {
            System.out.println(path);
            return 1;
        }
        int count =0;
        if(sr+1<=er) count += mazepath(sr+1, sc, er, ec,path+"H");
        if(sc+1<=ec) count += mazepath(sr, sc+1, er, ec,path+"V");
        if(sc+1<=ec && sr+1<=er) count += mazepath(sr+1, sc+1, er, ec,path+"D");
        return count;
    }

    public static void main(String[] args) {
        System.out.println(mazepath(0,0,2,2,""));
    }
}
