//String str = "THis is the program";             // output = " siht si eht margorp";

class swapEach
{
    public static void main(String[] args)
    {
        String str = "THis is the program";
        // output = " siht si eht margorp";

        String [] res = str.split(" ");
        // res = [this, is , a , program];
        String [] answer = new String[res.length];
        int count=0; 

        StringBuilder sb = new StringBuilder();
       for(int ii=0;ii<res.length;ii++)
       {       
            sb =new StringBuilder();
            for(int i =res[ii].length()-1; i>=0; i--){
                sb.append(res[ii].charAt(i));
            }
            answer [count++]= sb.toString();
        }



        for(String s : res)
        {
            System.out.print(s+" ");
        }
    }
}
