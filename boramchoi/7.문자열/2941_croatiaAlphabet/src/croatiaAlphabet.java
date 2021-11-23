import java.io.BufferedReader;
import java.io.InputStreamReader;

public class croatiaAlphabet {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(cntCroatiaAlphabet(str.split("")));
        
    }

    public static int cntCroatiaAlphabet(String[] strArr) {
        int cnt = 0;
        String str1 = "";
        String str2 = "";

        if (strArr.length == 1) {
            return 1;

        } else if (100 < strArr.length) {
            System.out.println("out of bounds");
            return -1;
        }

        for (int i = 0; i < strArr.length ; i++) {

            if (i < strArr.length - 2) {
                str1 = strArr[i+1];
                str2 = strArr[i+2];
            } else if (i < strArr.length - 1) {
                str1 = strArr[i+1];
            }

            switch (strArr[i]) {
                case "c":
                    if(i < strArr.length - 1) {
                        if (isCnt(str1, "=") || isCnt(str1, "-")) {
                            i += 1;
                        }
                    }
                    cnt++;
                    break;
                case "d":
                    if (i < strArr.length - 2) {
                        if (isCnt(str1, "z") && isCnt(str2, "=")) {
                            i += 2;
                        } else if (isCnt(str1, "-")) {
                            i += 1;
                        }
                    } else if (i < strArr.length - 1) {
                        if (isCnt(str1, "-")) {
                            i += 1;
                        }
                    }
                    cnt++;
                    break;
                case "l":
                case "n":
                    if(i < strArr.length - 1) {
                        if (isCnt(str1, "j")) {
                            i += 1;
                        }
                    }
                    cnt++;
                    break;
                case "s":
                case "z":
                    if(i < strArr.length - 1) {
                        if (isCnt(str1, "=")) {
                            i += 1;
                        }
                    }
                    cnt++;
                    break;
                default:
                    cnt++;
                    break;
            }

        }

        return cnt;
    }

    public static boolean isCnt(String str1, String str2) {
        return str1.equals(str2);
    }

}
