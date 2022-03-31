//Input : ['s','u','n',' ','i','s',' ','a',' ','s','t','a','r']; Output : ['s','t','a','r',' ','a',' ','i','s',' ','s','u','n']

class main1
{

    static String swap(String str)
    {
        int low = 0;
        StringBuilder sb = new StringBuilder();

        for(int i =str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }

        return sb.toString();


    }
    public static void main(String[] args)
    {
        char [] c = {'s','u','n',' ','i','s',' ','a',' ','s','t','a','r'};
        String []arr = new String[4];
        int acount=0;
        int ii=0;
        while(ii<c.length-1)
        {
            StringBuilder sb = new StringBuilder();
            while(c[ii]!=' ' && ii<c.length-1)
            {
                sb.append(c[ii]);
                ii++;
            }
            if(ii==c.length-1)
            {
                sb.append(c[ii]);
            }
            arr[acount++] = sb.toString();
            ii++;
        }

         for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    
        System.out.println("``````````````````````````````````````````");

        String []rev_arr = new String[4];
        int sidx=0;
        for(int j=arr.length-1;j>=0;j--){
            String ans = swap(arr[j]);
            rev_arr[sidx++]=ans;
        }

        for(int i=0; i<rev_arr.length; i++)
        {
            System.out.print(rev_arr[i]+" ");
        }
        System.out.println("................................................................");

        char []cres = new char[20];

        int midx =0;
        for(int k=0;k<rev_arr.length;k++){
            String cur = rev_arr[k];
            int len = cur.length();
            
            int pidx = 0;
            while(pidx<len){
                cres[midx++]=cur.charAt(pidx++);                
            }
            if(k!=rev_arr.length-1)
                cres[midx++]=' ';
        } 

        for(int kk=0;kk<midx+1;kk++)
        {
            System.out.println(cres[kk]);
        }


    }

   
}


//hello this is the task after push to github