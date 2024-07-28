public class Main
{
    public static void main(String[] args)
    {
        String nazwa = "Cześć";
        nazwa = nazwa.substring(0, 3) + "kaj";
        System.out.println(nazwa);

        if(nazwa.equals("Czekaj"))
        {
            System.out.println("Nazwy są takie same");
        }

        if(nazwa.compareTo("Czekaj") == 0)
        {
            System.out.println("Nazwy są takie same");
        }

        char ChineseSign = '\u4F60';
        System.out.println(ChineseSign);

        var znakSMP = Character.toChars(0x1F349);
        System.out.println(znakSMP);

        String stringSMP = "\uD83C\uDF7A";
        System.out.println(stringSMP);

        var stringLong = Character.toString(0x1F99A);
        System.out.println(stringLong);

        String whitespace = "\n";
        boolean isEmpty = whitespace.isEmpty();
        boolean isBlank = whitespace.isBlank();

        System.out.println(isEmpty + " "+ isBlank);
    }
}