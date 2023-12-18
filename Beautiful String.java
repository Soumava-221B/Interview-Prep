/*
Problem statement:
Ninja has been given a binary string 'STR' containing either '0' or '1'. A binary string is called beautiful if it contains alternating 0s and 1s. For example: '0101', '1010', '101', '010' are beautiful strings. He wants to make 'STR' beautiful by performance some operations on it. In one operation, Ninja can convert '0' into '1' or vice versa. Your task is to determine the minimum number of operation Ninja should perform to make 'STR' beautiful.

For Example:
Minimum operation to make 'STR' '0010' beautiful is '1'. In one operation, we can convert '0' at index '0' (0-based indexing) to '1'. The 'STR' now becomes '1010' which is a beautiful string.
*/

public static int makeBeautiful(String str) {
        //count for answer array
        int counta = 0;

        //count for temp array
        int countt=1;
        char ans[]= str.toCharArray();
        char temp[] = str.toCharArray();

        // if(temp[0]== '0') temp[0] ='1';

        // else if(temp[0] == '1') temp[0] = '0';

 
        //change the temp[0] element accordingly
        temp[0] = temp[0] == '0' ? '1':'0';
        for(int i=0 ; i<ans.length-1 ; i++){

            //change the i+1 element if it's same as before and increase the count
            if(temp[i] == '0' && temp[i+1] == '0'){
                temp[i+1] = '1';
                countt++;

                 //change the i+1 element if it's same as before and increase the count

            }else if(temp[i] == '1' && temp[i+1] == '1'){
                temp[i+1] = '0';
                countt++;

            }
             //change the i+1 element if it's same as before and increase the count

            if(ans[i] == '0' && ans[i+1] == '0'){
                ans[i+1] = '1';
                counta++;

                 //change the i+1 element if it's same as before and increase the count
            }else if( ans[i] == '1' && ans[i+1] == '1'){
                ans[i+1] = '0';
                counta++;
            }

        }

        // get the minimun from both the arrays

        return Math.min(counta, countt);
    }