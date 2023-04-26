package imports;

public class ArrayFromInput {

    String S1; String S2; String S3;
    int I1; int I2; int I3;

    public ArrayFromInput(String S1, String S2, String S3, int I1, int I2, int I3){
        //Attachment
        this.S1=S1;
        this.S2=S2;
        this.S3=S3;
        this.I1=I1;
        this.I2=I2;
        this.I3=I3;
    }



    public String[] attachStrings(){
        String[] temp1 = new String[3];

        temp1[0] = this.S1;
        temp1[1] = this.S2;
        temp1[2] = this.S3;

        return temp1;
    };
    public int[] attachInt(){
        int[] temp1 = new int[3];

        temp1[0] = this.I1;
        temp1[1] = this.I2;
        temp1[2] = this.I3;

        return temp1;
    };

}
