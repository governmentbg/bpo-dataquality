package bg.duosoft.patentsexporter.util;

public class Transliteration {

    public static String translit(String text, boolean isTransliterate) {
        if (text == null)
            return null;
        if (!isTransliterate)
            return text;
        else {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                if (i != text.length() - 1)
                    if (currentChar == 'И' && text.charAt(i + 1) == 'Я') {
                        sb.append("IA");
                        i = i + 1;
                    } else if (currentChar == 'и' && text.charAt(i + 1) == 'я') {
                        sb.append("ia");
                        i = i + 1;
                    } else
                        transliteration(sb, currentChar);
                else
                    transliteration(sb, currentChar);
            }
            return sb.toString();
        }

    }

    private static void transliteration(StringBuilder sb, char currentChar) {
        switch (currentChar) {
            case 'а':
                sb.append("a");
                break;
            case 'б':
                sb.append("b");
                break;
            case 'в':
                sb.append("v");
                break;
            case 'г':
                sb.append("g");
                break;
            case 'д':
                sb.append("d");
                break;
            case 'е':
                sb.append("e");
                break;
            case 'ж':
                sb.append("zh");
                break;
            case 'з':
                sb.append("z");
                break;
            case 'и':
                sb.append("i");
                break;
            case 'й':
                sb.append("y");
                break;
            case 'к':
                sb.append("k");
                break;
            case 'л':
                sb.append("l");
                break;
            case 'м':
                sb.append("m");
                break;
            case 'н':
                sb.append("n");
                break;
            case 'о':
                sb.append("o");
                break;
            case 'п':
                sb.append("p");
                break;
            case 'р':
                sb.append("r");
                break;
            case 'с':
                sb.append("s");
                break;
            case 'т':
                sb.append("t");
                break;
            case 'у':
                sb.append("u");
                break;
            case 'ф':
                sb.append("f");
                break;
            case 'х':
                sb.append("h");
                break;
            case 'ц':
                sb.append("ts");
                break;
            case 'ч':
                sb.append("ch");
                break;
            case 'ш':
                sb.append("sh");
                break;
            case 'щ':
                sb.append("sht");
                break;
            case 'ъ':
                sb.append("a");
                break;
            case 'ь':
                sb.append("y");
                break;
            case 'ю':
                sb.append("yu");
                break;
            case 'я':
                sb.append("ya");
                break;
            case 'А':
                sb.append("A");
                break;
            case 'Б':
                sb.append("B");
                break;
            case 'В':
                sb.append("V");
                break;
            case 'Г':
                sb.append("G");
                break;
            case 'Д':
                sb.append("D");
                break;
            case 'Е':
                sb.append("E");
                break;
            case 'Ж':
                sb.append("ZH");
                break;
            case 'З':
                sb.append("Z");
                break;
            case 'И':
                sb.append("I");
                break;
            case 'Й':
                sb.append("Y");
                break;
            case 'К':
                sb.append("K");
                break;
            case 'Л':
                sb.append("L");
                break;
            case 'М':
                sb.append("M");
                break;
            case 'Н':
                sb.append("N");
                break;
            case 'О':
                sb.append("O");
                break;
            case 'П':
                sb.append("P");
                break;
            case 'Р':
                sb.append("R");
                break;
            case 'С':
                sb.append("S");
                break;
            case 'Т':
                sb.append("T");
                break;
            case 'У':
                sb.append("U");
                break;
            case 'Ф':
                sb.append("F");
                break;
            case 'Х':
                sb.append("H");
                break;
            case 'Ц':
                sb.append("TS");
                break;
            case 'Ч':
                sb.append("CH");
                break;
            case 'Ш':
                sb.append("SH");
                break;
            case 'Щ':
                sb.append("SHT");
                break;
            case 'Ъ':
                sb.append("A");
                break;
            case 'Ь':
                sb.append("Y");
                break;
            case 'Ю':
                sb.append("YU");
                break;
            case 'Я':
                sb.append("YA");
                break;
            case 'Ы':
            case 'Э':
            case 'ы':
            case 'э':
            default:
                sb.append(currentChar);
        }
    }
}

