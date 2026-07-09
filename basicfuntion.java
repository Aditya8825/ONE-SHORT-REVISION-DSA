public class basicfuntion {
   public static void main(String[] args) {
    int n=6;
    int r=2;

    // calculated n!
    int nFact=1;
    for(int i=1; i<=n; i++){
        nFact *=i;


    }

    //calculate r!
    int rFact =1;
    for(int i=1; i<=r; i++){
        rFact *=i;
    }
    // calculated 
    int n_rFact=1;
    
    for(int i=1; i<=n-r; i++){
        n_rFact *=i;
    }
    int ncr= nFact/(rFact*n_rFact);
    System.out.println(ncr);
   } 
}
