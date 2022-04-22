public class Main {
    // פעולה שמקבלת מערך דו מימדי ומשתנה של שורה ומחזירה 1 או 0 אם סכום השורה חיובי או לא
    static int sumOfLine (int[][] array, int k)
    {
        //יוצרים משתנה של סכום
        int sum = 0;
        //לולאה שרצה על הטורים בשורה שקיבלנו בפעולה
        for (int i=0; i<array.length; i++)
        {
            //מכניסים את המספר בלולאה למשתנה סכום
            sum = sum + array[k][i];
        }
        //אם המשתנה סכום חיובי מחזירים 1 ואם שלילי מחזירים 0
        if (sum>0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    // פעולה שמקבלת מערך דו מימדי ומשתנה של טור ומחזירה 1 או 0 אם סכום הטור חיובי או לא
    static int sumOfColom (int[][] array, int j)
    {
        //יוצרים משתנה של סכום
        int sum = 0;
        //לולאה שרצה על השורות
        for (int i=0; i<array[0].length; i++)
    {
        //מכניסים את המספר בלולאה למשתנה סכום
        sum = sum + array[i][j];
    }
        //אם המשתנה סכום חיובי מחזירים 1 ואם שלילי מחזירים 0
        if (sum>0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    //פעולה שמקבלת מערך ובודקת אם מערך הוא מערך חיובי
    static void positivLineArray (int[][] array)
    {
        //יוצרים משתנה סכום 1 וסכום 2
        int sum1=0,sum2=0;
        //פותחים לולאה שעוברת על השורות וכל שורה נכנסת לפעולה של סכום שורות
        for (int i=0; i<array[0].length; i++)
        {
            //מכניסים את המספר שהפעולה החזירה למשתנה סכום 1
            sum1=sum1+sumOfLine(array,i);
        }
        //פותחים לולאה שעוברת על הטורים וכל טור נכנס לפעולה של סכום טור
        for (int i=0; i<array.length; i++)
        {
            //מכניסים את המספר שהפעולה החזירה למשתנה סכום 2
            sum2=sum2+sumOfColom(array,i);
        }
        //אם משתנה סכום 1 גדול מ2 הפעולה תחזיר כן ואם משתנה סכום 2 גדול מ1 הפעולה תחזיר לא
        if (sum1>sum2)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }



    public static void main(String[] args)
    {
        int[][] values =
                {
                 {1, -1, 1}
                ,{1, -1, 1},
                 {1, -1, 1}
                };
        positivLineArray(values);
    }
}