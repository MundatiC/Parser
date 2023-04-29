// Output created by jacc on Sat Apr 29 17:41:29 EAT 2023


import java.io.StringReader;
import java.util.Scanner;
import java.util.zip.*;
import java.io.Reader;


class Prolog implements PrologToken {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private String[] yysv;
    private String yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new String[yyss];
        yytok = (token
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    switch (yytok) {
                        case CHARR:
                            yyn = 9;
                            continue;
                        case '"':
                            yyn = 10;
                            continue;
                        case '?':
                            yyn = 11;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 106;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case ENDINPUT:
                        case '"':
                        case CHARR:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    switch (yytok) {
                        case CHARR:
                            yyn = 9;
                            continue;
                        case '"':
                            yyn = 10;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    switch (yytok) {
                        case '-':
                        case ENDINPUT:
                        case '"':
                        case error:
                        case '?':
                            yyn = 109;
                            continue;
                    }
                    yyn = yyr21();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case '.':
                            yyn = 13;
                            continue;
                        case ':':
                            yyn = 14;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case '(':
                            yyn = 15;
                            continue;
                        case ':':
                        case '.':
                        case ',':
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    switch (yytok) {
                        case '?':
                        case ENDINPUT:
                        case error:
                        case '-':
                            yyn = 109;
                            continue;
                    }
                    yyn = yyr25();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    switch (yytok) {
                        case CHARR:
                            yyn = 9;
                            continue;
                        case CHAR:
                            yyn = 21;
                            continue;
                        case INTEGER:
                            yyn = 22;
                            continue;
                        case SYMBOLS:
                            yyn = 23;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    switch (yytok) {
                        case '-':
                            yyn = 26;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    switch (yytok) {
                        case ENDINPUT:
                        case '"':
                        case CHARR:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    switch (yytok) {
                        case ENDINPUT:
                        case '"':
                        case CHARR:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    switch (yytok) {
                        case '-':
                            yyn = 27;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    switch (yytok) {
                        case CHARR:
                            yyn = 9;
                            continue;
                        case '"':
                            yyn = 10;
                            continue;
                        case CHAR:
                            yyn = 21;
                            continue;
                        case INTEGER:
                            yyn = 22;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case '-':
                        case ENDINPUT:
                        case '"':
                        case error:
                        case '?':
                            yyn = 109;
                            continue;
                    }
                    yyn = yyr22();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    switch (yytok) {
                        case '?':
                        case ENDINPUT:
                        case error:
                        case '-':
                            yyn = 109;
                            continue;
                    }
                    yyn = yyr32();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    switch (yytok) {
                        case '?':
                        case ENDINPUT:
                        case error:
                        case '-':
                            yyn = 109;
                            continue;
                    }
                    yyn = yyr30();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    switch (yytok) {
                        case '?':
                        case ENDINPUT:
                        case error:
                        case '-':
                            yyn = 109;
                            continue;
                    }
                    yyn = yyr33();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    switch (yytok) {
                        case '?':
                        case ENDINPUT:
                        case error:
                        case '-':
                            yyn = 109;
                            continue;
                    }
                    yyn = yyr31();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    switch (yytok) {
                        case '?':
                        case ENDINPUT:
                        case error:
                        case '-':
                            yyn = 109;
                            continue;
                    }
                    yyn = yyr26();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    switch (yytok) {
                        case '?':
                        case ENDINPUT:
                        case error:
                        case '-':
                            yyn = 109;
                            continue;
                    }
                    yyn = yyr29();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    switch (yytok) {
                        case '?':
                        case ENDINPUT:
                        case error:
                        case '-':
                            yyn = 109;
                            continue;
                    }
                    yyn = yyr34();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    switch (yytok) {
                        case '"':
                        case INTEGER:
                        case SYMBOLS:
                        case CHARR:
                        case CHAR:
                            yyn = yyr35();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    switch (yytok) {
                        case CHARR:
                            yyn = 9;
                            continue;
                        case CHAR:
                            yyn = 21;
                            continue;
                        case INTEGER:
                            yyn = 22;
                            continue;
                        case SYMBOLS:
                            yyn = 23;
                            continue;
                        case '"':
                            yyn = 37;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    switch (yytok) {
                        case CHARR:
                            yyn = 9;
                            continue;
                        case '"':
                            yyn = 10;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    switch (yytok) {
                        case CHARR:
                            yyn = 9;
                            continue;
                        case '"':
                            yyn = 10;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    switch (yytok) {
                        case INTEGER:
                        case ',':
                        case ')':
                            yyn = yyr27();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 22;
                            continue;
                        case ',':
                        case ')':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    switch (yytok) {
                        case '(':
                            yyn = 42;
                            continue;
                        case ',':
                        case ')':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    switch (yytok) {
                        case ',':
                        case ')':
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    switch (yytok) {
                        case ',':
                        case ')':
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    switch (yytok) {
                        case ')':
                            yyn = 43;
                            continue;
                        case ',':
                            yyn = 44;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    switch (yytok) {
                        case '"':
                        case INTEGER:
                        case SYMBOLS:
                        case CHARR:
                        case CHAR:
                            yyn = yyr36();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    switch (yytok) {
                        case '(':
                        case ':':
                        case '.':
                        case ',':
                        case ')':
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    switch (yytok) {
                        case '.':
                        case ',':
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    switch (yytok) {
                        case ',':
                            yyn = 46;
                            continue;
                        case '.':
                            yyn = 47;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    switch (yytok) {
                        case ',':
                            yyn = 46;
                            continue;
                        case '.':
                            yyn = 48;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    switch (yytok) {
                        case INTEGER:
                        case ',':
                        case ')':
                            yyn = yyr28();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    switch (yytok) {
                        case CHARR:
                            yyn = 9;
                            continue;
                        case '"':
                            yyn = 10;
                            continue;
                        case CHAR:
                            yyn = 21;
                            continue;
                        case INTEGER:
                            yyn = 22;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    switch (yytok) {
                        case ':':
                        case '.':
                        case ',':
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    switch (yytok) {
                        case CHARR:
                            yyn = 9;
                            continue;
                        case '"':
                            yyn = 10;
                            continue;
                        case CHAR:
                            yyn = 21;
                            continue;
                        case INTEGER:
                            yyn = 22;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    switch (yytok) {
                        case CHARR:
                            yyn = 9;
                            continue;
                        case '"':
                            yyn = 10;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    switch (yytok) {
                        case ENDINPUT:
                        case '"':
                        case CHARR:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 102:
                    switch (yytok) {
                        case ',':
                            yyn = 44;
                            continue;
                        case ')':
                            yyn = 52;
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 103:
                    switch (yytok) {
                        case ',':
                        case ')':
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    switch (yytok) {
                        case '.':
                        case ',':
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (yylval
                                 );
                    yytok = (yylex()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    switch (yytok) {
                        case ',':
                        case ')':
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 109;
                    continue;

                case 106:
                    return true;
                case 107:
                    yyerror("stack overflow");
                case 108:
                    return false;
                case 109:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        String[] newyysv = new String[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys8() {
        switch (yytok) {
            case CHARR:
                return 9;
            case CHAR:
                return 21;
            case INTEGER:
                return 22;
            case SYMBOLS:
                return 23;
            case '(':
            case ':':
            case '.':
            case ',':
            case ')':
                return yyr19();
        }
        return 109;
    }

    private int yys34() {
        switch (yytok) {
            case INTEGER:
            case ',':
            case ')':
            case SYMBOLS:
            case CHARR:
            case CHAR:
                return yyr23();
        }
        return 109;
    }

    private int yys35() {
        switch (yytok) {
            case CHARR:
                return 9;
            case CHAR:
                return 21;
            case INTEGER:
                return 22;
            case SYMBOLS:
                return 23;
            case ',':
            case ')':
                return yyr15();
        }
        return 109;
    }

    private int yys45() {
        switch (yytok) {
            case INTEGER:
            case ',':
            case ')':
            case SYMBOLS:
            case CHARR:
            case CHAR:
                return yyr24();
        }
        return 109;
    }

    private int yyr1() { // program : clauselist
        { System.out.println("Parsed clause: " + yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr2() { // program : query
        { System.out.println("Parsed clause: " + yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr30() { // character : lowercaseletter
        yysp -= 1;
        return yypcharacter();
    }

    private int yyr31() { // character : uppercaseletter
        yysp -= 1;
        return yypcharacter();
    }

    private int yyr32() { // character : digit
        yysp -= 1;
        return yypcharacter();
    }

    private int yyr33() { // character : special
        yysp -= 1;
        return yypcharacter();
    }

    private int yypcharacter() {
        switch (yyst[yysp-1]) {
            case 25: return 36;
            case 10: return 24;
            case 8: return 16;
            default: return 45;
        }
    }

    private int yyr5() { // clause : predicate '.'
        yysp -= 2;
        return yypclause();
    }

    private int yyr6() { // clause : predicate ':' '-' predicatelist '.'
        yysp -= 5;
        return yypclause();
    }

    private int yypclause() {
        switch (yyst[yysp-1]) {
            case 0: return 2;
            default: return 12;
        }
    }

    private int yyr3() { // clauselist : clause
        yysp -= 1;
        return 3;
    }

    private int yyr4() { // clauselist : clauselist clause
        yysp -= 2;
        return 3;
    }

    private int yyr29() { // digit : INTEGER
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 44: return 28;
            case 42: return 28;
            case 29: return 41;
            case 15: return 28;
            default: return 17;
        }
    }

    private int yyr25() { // lowercaseletter : CHARR
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 35: return 18;
            case 25: return 18;
            case 10: return 18;
            case 8: return 18;
            default: return 4;
        }
    }

    private int yyr27() { // numeral : digit
        yysp -= 1;
        return 29;
    }

    private int yyr28() { // numeral : numeral digit
        yysp -= 2;
        return 29;
    }

    private int yyr9() { // predicate : atom
        yysp -= 1;
        return yyppredicate();
    }

    private int yyr10() { // predicate : atom '(' termlist ')'
        yysp -= 4;
        return yyppredicate();
    }

    private int yyppredicate() {
        switch (yyst[yysp-1]) {
            case 46: return 51;
            case 3: return 5;
            case 0: return 5;
            default: return 38;
        }
    }

    private int yyr7() { // predicatelist : predicate
        yysp -= 1;
        return yyppredicatelist();
    }

    private int yyr8() { // predicatelist : predicatelist ',' predicate
        yysp -= 3;
        return yyppredicatelist();
    }

    private int yyppredicatelist() {
        switch (yyst[yysp-1]) {
            case 26: return 39;
            default: return 40;
        }
    }

    private int yyr19() { // atom : smallatom
        yysp -= 1;
        return yypatom();
    }

    private int yyr20() { // atom : '"' string '"'
        yysp -= 3;
        return yypatom();
    }

    private int yypatom() {
        switch (yyst[yysp-1]) {
            case 44: return 30;
            case 42: return 30;
            case 15: return 30;
            default: return 6;
        }
    }

    private int yyr18() { // query : '?' '-' predicatelist '.'
        yysp -= 4;
        return 7;
    }

    private int yyr21() { // smallatom : lowercaseletter
        yysp -= 1;
        return 8;
    }

    private int yyr22() { // smallatom : smallatom character
        yysp -= 2;
        return 8;
    }

    private int yyr34() { // special : SYMBOLS
        yysp -= 1;
        return 19;
    }

    private int yyr35() { // string : character
        yysp -= 1;
        return 25;
    }

    private int yyr36() { // string : string character
        yysp -= 2;
        return 25;
    }

    private int yyr17() { // structure : atom '(' termlist ')'
        yysp -= 4;
        return 31;
    }

    private int yyr13() { // term : numeral
        yysp -= 1;
        return yypterm();
    }

    private int yyr14() { // term : atom
        yysp -= 1;
        return yypterm();
    }

    private int yyr15() { // term : variable
        yysp -= 1;
        return yypterm();
    }

    private int yyr16() { // term : structure
        yysp -= 1;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 44: return 50;
            default: return 32;
        }
    }

    private int yyr11() { // termlist : term
        yysp -= 1;
        return yyptermlist();
    }

    private int yyr12() { // termlist : termlist ',' term
        yysp -= 3;
        return yyptermlist();
    }

    private int yyptermlist() {
        switch (yyst[yysp-1]) {
            case 15: return 33;
            default: return 49;
        }
    }

    private int yyr26() { // uppercaseletter : CHAR
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 44: return 34;
            case 42: return 34;
            case 15: return 34;
            default: return 20;
        }
    }

    private int yyr23() { // variable : uppercaseletter
        yysp -= 1;
        return 35;
    }

    private int yyr24() { // variable : variable character
        yysp -= 2;
        return 35;
    }

    protected String[] yyerrmsgs = {
    };



private void yyerror(String msg) {
    System.out.println("ERROR: " + msg);
}

private int c;

/** Read a single input character from standard input.
*/
private void nextChar() {
if (c>=0) {
    try {
        c = System.in.read();
    } catch (Exception e) {
        c = (-1);
    }
}
}

int token;
String yylval;

int yylex() {
for (;;) {
// Skip whitespace
while (c==' '||c=='\n'|| c=='\t'||c=='\r') {
  nextChar();
}
if (c<0) {
  return (token=ENDINPUT);
}
switch (c) {
case '.' : 
    nextChar();
    return token='.';
case ',' : 
    nextChar();
    return token=',';
case '(' : 
    nextChar();
    return token='(';
case ')' : 
    nextChar();
    return token = ')';
case '?' : 
    nextChar();
    return token = '?';
case '-' : 
    nextChar();
    return token = '-';
case ':' :
    nextChar();
    return token = ':';
default:
                if (Character.isLetter((char)c)) {
                    StringBuilder sb = new StringBuilder();
                    do {
                        sb.append((char)c);
                        nextChar();
                    } while (Character.isLetterOrDigit((char)c) || c == '_'); 

                    yylval = sb.toString();
                   
                        return token=CHAR;
     
                } else {
                    yyerror("Illegal character "+c);
                    nextChar();
                }
        
}
}
}

public void setInput(Reader reader) {
    yylval = null;
    
}



  public static void main(String[] args) {
    Prolog parser = new Prolog();
    Scanner scanner = new Scanner(System.in);

  while (true) {
    System.out.print("Enter query or clause(or EOF to exit): ");
    String input = scanner.nextLine();
    if (input == null || input.isEmpty()) {
        break;
    }
    parser.setInput(new StringReader(input));
    parser.nextChar();
    parser.yylex();
    parser.parse();
    
}

  }




}
