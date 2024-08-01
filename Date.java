import java.util.Scanner;

public class marathiDate {
    public static void main(String[] args) {
        int key;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Marathi");
        System.out.println("2.English");
        System.out.print("Please select the language : ");
        key = sc.nextInt();
        int day, month, year;
        int arrMonthleap[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int arrMonthNoleap[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (key == 1)
        {
            System.out.println("************  सर्वांचे स्वागत ************** ");
            
            String str0[] = {"सोमवार", "मंगळवार", "बुधवार", "गुरुवार", "शुक्रवार", "शनिवार", "रविवार"};
            String str1[] = {"मंगळवार", "बुधवार", "गुरुवार", "शुक्रवार", "शनिवार", "रविवार", "सोमवार"};
            String str2[] = {"बुधवार", "गुरुवार", "शुक्रवार", "शनिवार", "रविवार", "सोमवार", "मंगळवार"};
            String str3[] = {"गुरुवार", "शुक्रवार", "शनिवार", "रविवार", "सोमवार", "मंगळवार", "बुधवार"};
            String str4[] = {"शुक्रवार", "शनिवार", "रविवार", "सोमवार", "मंगळवार", "बुधवार", "गुरुवार"};
            String str5[] = {"शनिवार", "रविवार", "सोमवार", "मंगळवार", "बुधवार", "गुरुवार", "शुक्रवार"};
            String str6[] = {"रविवार", "सोमवार", "मंगळवार", "बुधवार", "गुरुवार", "शुक्रवार", "शनिवार"};

            int res;

            System.out.print("वर्ष  सांगा :");
            year = sc.nextInt();

            System.out.print("महिना सांगा :");
            month = sc.nextInt();

            System.out.print("दिवस सांगा :");
            day = sc.nextInt();

            int daycount = 0;
            int leap = (year - 1951) / 4;
            int dateEst = (year - 1951) + leap;
            int firstDayCalc = dateEst % 7;

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && month <= 12 && month > 0 && day <= arrMonthleap[month - 1]) {
                for (int i = 0; i < month - 1; i++) {
                    daycount = daycount + arrMonthleap[i];
                }

                daycount = daycount + day;
                res = (daycount - 1) % 7;
                System.out.println("हे लीप वर्ष आहे  ");

                System.out.print("हि तारीख  ");
                System.out.print(year);
                System.out.print(" ह्या वर्ष्यातील ");
                System.out.print(daycount);
                System.out.println(" वा दिवस आहे...");

                System.out.print("आणि ह्या दिवशी आठवड्यातील ");


                switch (firstDayCalc) {
                    case 0:
                        System.out.print(str0[res]);
                        System.out.println(" होता.");
                        break;

                    case 1:
                        System.out.print(str1[res]);
                        System.out.println(" होता.");
                        break;

                    case 2:
                        System.out.print(str2[res]);
                        System.out.print(" होता.");
                        break;

                    case 3:
                        System.out.print(str3[res]);
                        System.out.print(" होता.");
                        break;

                    case 4:
                        System.out.print(str4[res]);
                        System.out.print(" होता.");
                        break;

                    case 5:
                        System.out.print(str5[res]);
                        System.out.print(" होता.");
                        break;

                    case 6:
                        System.out.print(str6[res]);
                        System.out.print(" होता.");
                        break;

                }
            } else if (month <= 12 && month > 0 && day <= arrMonthNoleap[month - 1]) {
                for (int i = 0; i < month - 1; i++) {
                    daycount = daycount + arrMonthNoleap[i];
                }
                daycount = daycount + day;

                System.out.println("हे लीप वर्ष नाही.");

                System.out.print("हा ");
                System.out.print(year);
                System.out.print(" ह्या वर्ष्यातील ");
                System.out.print(daycount);
                System.out.println(" वा दिवस आहे...");

                System.out.print("आणि ह्या दिवशी आठवड्यातील ");

                res = daycount % 7;


                switch (firstDayCalc) {
                    case 0:
                        System.out.print(str0[res]);
                        System.out.print(" होता.");
                        break;

                    case 1:
                        System.out.print(str1[res]);
                        System.out.print(" होता.");
                        break;

                    case 2:
                        System.out.print(str2[res]);
                        System.out.print(" होता.");
                        break;

                    case 3:
                        System.out.print(str3[res]);
                        System.out.print(" होता.");
                        break;

                    case 4:
                        System.out.print(str4[res]);
                        System.out.print(" होता.");
                        break;

                    case 5:
                        System.out.print(str5[res]);
                        System.out.print(" होता.");
                        break;

                    case 6:
                        System.out.print(str6[res]);
                        System.out.print(" होता.");
                        break;

                }
            } else {
                System.out.println("आपण चुकीची तारीख सांगितली आहे !!!!!!");
            }
        } else {
            System.out.println("************    WELCOME TO THE DAY ESTIMATER     ************** ");



            String str0[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            String str1[] = {"Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday"};
            String str2[] = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
            String str3[] = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
            String str4[] = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
            String str5[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            String str6[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            int res;

            System.out.print("Enter the Year:");
            year = sc.nextInt();

            System.out.print("Enter the Month :");
            month = sc.nextInt();

            System.out.print("Enter the date :");
            day = sc.nextInt();

            int daycount = 0;
            int leap = (year - 1951) / 4;
            int dateEst = (year - 1951) + leap;
            int firstDayCalc = dateEst % 7;

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && month <= 12 && month > 0 && day <= arrMonthleap[month - 1]) {
                for (int i = 0; i < month - 1; i++) {
                    daycount = daycount + arrMonthleap[i];
                }

                daycount = daycount + day;
                res = (daycount - 1) % 7;
                System.out.println("This is a leap year ");

                System.out.print("It is the ");
                System.out.print(daycount);
                System.out.print("th day of year ");
                System.out.print(year);
                System.out.println("......");
                System.out.print("And day at that date is :");


                switch (firstDayCalc) {
                    case 0:
                        System.out.println(str0[res]);
                        break;

                    case 1:
                        System.out.println(str1[res]);
                        break;

                    case 2:
                        System.out.println(str2[res]);
                        break;

                    case 3:
                        System.out.println(str3[res]);
                        break;

                    case 4:
                        System.out.println(str4[res]);
                        break;

                    case 5:
                        System.out.println(str5[res]);
                        break;

                    case 6:
                        System.out.println(str6[res]);
                        break;

                }
            } else if (month <= 12 && month > 0 && day <= arrMonthNoleap[month - 1]) {
                for (int i = 0; i < month - 1; i++) {
                    daycount = daycount + arrMonthNoleap[i];
                }
                daycount = daycount + day;

                System.out.println("It is not a leap year ");

                System.out.print("It is the ");
                System.out.print(daycount);
                System.out.print("th day of year ");
                System.out.print(year);
                System.out.println("......");
                System.out.print("And day at that date is :");

                res = daycount % 7;


                switch (firstDayCalc) {
                    case 0:
                        System.out.println(str0[res]);
                        break;

                    case 1:
                        System.out.println(str1[res]);
                        break;

                    case 2:
                        System.out.println(str2[res]);
                        break;

                    case 3:
                        System.out.println(str3[res]);
                        break;

                    case 4:
                        System.out.println(str4[res]);
                        break;

                    case 5:
                        System.out.println(str5[res]);
                        break;

                    case 6:
                        System.out.println(str6[res]);
                        break;

                }
            } else {
                System.out.println("You Entered Invalid date !!!!!!");
            }
        }
    }
}
