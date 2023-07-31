public class Zodiac {
    public String determinateZodiacSign(int month, int day){
        String zodiacSing = "";
        if (day > 0  && day <= 31) {
            switch (month) {
                case 1:
                    if (day > 20 && day <= 31) {
                        zodiacSing = "Aquarius";

                    } else {
                        zodiacSing = "Capricorn";
                    }
                    break;
                case 2:
                    if (day > 19 && day <= 28) {
                        zodiacSing = "Pisces";
                    } else if(day >= 1 && day <=19 ) {
                        zodiacSing = "Acquarius";
                    }
                    else
                    {
                        System.out.println("Febbraio ha solo 28 giorni!!");
                    }
                    break;
                case 3:
                    if (day > 20 && day <= 31) {
                        zodiacSing = "Aries";
                    } else {
                        zodiacSing = "Pisces";
                    }
                    break;
                case 4:
                    if (day > 20 && day <= 30) {
                        zodiacSing = "Taurus";
                    } else {
                        zodiacSing = "Aries";
                    }
                    break;
                case 5:
                    if (day > 20 && day <= 31) {
                        zodiacSing = "Gemini";
                    } else {
                        zodiacSing = "Taurus";
                    }
                    break;
                case 6:
                    if (day > 21 && day <= 30) {
                        zodiacSing = "Cancer";
                    } else {
                        zodiacSing = "Gemini";
                    }
                    break;
                case 7:
                    if (day > 22 && day <= 31) {
                        zodiacSing = "Leo";
                    } else {
                        zodiacSing = "Cancer";
                    }
                    break;
                case 8:
                    if (day > 23 && day <= 31) {
                        zodiacSing = "Virgo";
                    } else {
                        zodiacSing = "Leo";
                    }
                    break;
                case 9:
                    if (day > 22 && day <= 30) {
                        zodiacSing = "Libra";
                    } else {
                        zodiacSing = "Virgo";
                    }
                    break;
                case 10:
                    if (day > 22 && day <= 31) {
                        zodiacSing = "Scorpio";
                    } else {
                        zodiacSing = "Libra";
                    }
                    break;
                case 11:
                    if (day > 22 && day <= 30) {
                        zodiacSing = "Sagittarius";
                    } else {
                        zodiacSing = "Scorpio";
                    }
                    break;
                case 12:
                    if (day > 21 && day <= 31) {
                        zodiacSing = "Capricorn";
                    } else {
                        zodiacSing = "Sagittarius";
                    }
                    break;
                default: System.out.println("Il mese inserito non è valido!");
            }
        }
        else {
            System.out.println("I giorni del mese devono essere compresi tra 0 e 31");
        }
        return zodiacSing;
    }
}
