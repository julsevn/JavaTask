package Task1_Zodiac;

public class Zodiac {

    public static void main(String[] args) {
      final Zodiacs ARIES = Zodiacs.ARIES;
      final Zodiacs TAURUS = Zodiacs.TAURUS;
      final Zodiacs GEMINI = Zodiacs.GEMINI;
      final Zodiacs CANCER = Zodiacs.CANCER;
      final Zodiacs LEO = Zodiacs.LEO;
      final Zodiacs VIRGO = Zodiacs.VIRGO;
      final Zodiacs LIBRA = Zodiacs.LIBRA;
      final Zodiacs SCORPIUS = Zodiacs.SCORPIUS;
      final Zodiacs SAGITTARIUS = Zodiacs.SAGITTARIUS;
      final Zodiacs CAPRICORNUS = Zodiacs.CAPRICORNUS;
      final Zodiacs AQUARIUS = Zodiacs.AQUARIUS;
      final Zodiacs PISCES = Zodiacs.PISCES;

      Zodiacs [] zodiac = Zodiacs.values();
      for (Zodiacs z: zodiac){
          System.out.println(z);
      }
        System.out.println(Zodiacs.AQUARIUS.ordinal());


      }












    }

