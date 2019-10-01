import java.util.Scanner;


class PrefinalActivity1 {
		public static void main(String[] args) {
            int number = 0;            
            Scanner sc = new Scanner(System.in);
            System.out.print("Please type any number from 0 and 1000: ");
             // read the number
            number = sc.nextInt();
            //if input is -1 program will exit, else it will loop
            while(number!=-1){
               if(number>=0 && number<=1000){
                    if(number==0){
                        System.out.print("\t" + number + "= ZERO");
                    } else {
                        System.out.print("\t" + number + "=");
                        // check if number is divisible by 1 thousand
                        numberToWord(((number / 1000) % 100), " thousand");
                        // check if number is divisible by 1 hundred
                        numberToWord(((number / 100) % 10), " hundred");
                        //if the number is 2 digits or less
                        numberToWord((number % 100), " ");
                    }

                }else{
                  System.out.print("Number out of range");
              }
             System.out.print("\nPlease type any number from 0 and 1000: ");
             number = sc.nextInt();
            }
        }
        //convert input to string representation of number
        public static void numberToWord(int num, String val) {
            String ones[] = {" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", "fifteen", " sixteen", " seventeen", " eighteen", " nineteen"
            };
            String tens[] = {" ", " ", " twenty", " thirty", " fourty", " fifty", " sixty", " seventy", " eighty", " ninety"};
            // check if number is within tens array
            if (num > 19) {
                System.out.print(tens[num / 10] + " " + ones[num % 10]);
            } else {
                System.out.print(ones[num]);
            }
            if (num > 0) {//Prints output
                System.out.print(val);
            }
        }
    }
		
	
	

