//Input : ['s','u','n',' ','i','s',' ','a',' ','s','t','a','r']; Output : ['s','t','a','r',' ','a',' ','i','s',' ','s','u','n']
class main 
{
    public static void main(String[] args)
    {
        char[] arr = {'s','u','n',' ','i','s',' ','a',' ','s','t','a','r'};
        String [] a = new String[4];
        int count = 0;
        int icount=0;
        while(icount < arr.length){
            StringBuilder sb = new StringBuilder();
            while(arr[icount]!=' ' && icount!=arr.length-1)
            {
               // System.out.println(arr[icount]);
                //cur=cur+arr[i];
                sb.append(arr[icount]);
               // System.out.println(icount);
                icount++;
            }
           // System.out.println(sb.toString());
           if(icount==arr.length-1){
               sb.append(arr[icount]);
           }
            a[count]=(sb.toString());
         //  System.out.println(a[count]);
            count++;
            icount++;
        }

    //     //a[] = ["sun","is","a","start"];


        int ii=0;
        String []new_arr = new String[4];
        for(int i =a.length-1; i>=0; i--)
        {
            new_arr[ii++]=a[i];
        }
          //new-arr[] = ["start","is","a","sun"];

        //   new_arr= new_arr.split(",");
        char[] newArr= new char[20];
        int cur=0;
       
        // char pre = '';

         

          
          for(int i=0;i<new_arr.length;i++){
              String str = new_arr[i];
             // System.out.println(str);
              int len = str.length();
               int par =0;
              while(par <len){
                  newArr[cur++]=str.charAt(par);
                //   len--;
                  par++;
              }
              newArr[cur++]=' ';
          }
            
            for(int i=0;i<arr.length;i++)
            {
              System.out.print(newArr[i]);
            }
            System.out.println(arr.length);
    }
}