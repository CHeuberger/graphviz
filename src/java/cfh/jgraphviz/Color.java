/*
 * Copyright: Carlos F. Heuberger. All rights reserved.
 *
 */
package cfh.jgraphviz;

import static java.util.Objects.*;

import java.util.Locale;

import static cfh.jgraphviz.Dot.*;

/**
 * @author Carlos F. Heuberger, 2023-10-16
 *
 */
public sealed interface Color extends ColorList {
    
    public static interface X11 {
        public static final String SCHEME = "x11";
        public static final Color ALICEBLUE  = new ColorImpl("/" + SCHEME + "/aliceblue");
        public static final Color ANTIQUEWHITE  = new ColorImpl("/" + SCHEME + "/antiquewhite");
        public static final Color ANTIQUEWHITE1  = new ColorImpl("/" + SCHEME + "/antiquewhite1");
        public static final Color ANTIQUEWHITE2  = new ColorImpl("/" + SCHEME + "/antiquewhite2");
        public static final Color ANTIQUEWHITE3 = new ColorImpl("/" + SCHEME + "/antiquewhite3");
        public static final Color ANTIQUEWHITE4  = new ColorImpl("/" + SCHEME + "/antiquewhite4");
        public static final Color AQUA  = new ColorImpl("/" + SCHEME + "/aqua");
        public static final Color AQUAMARINE  = new ColorImpl("/" + SCHEME + "/aquamarine");
        public static final Color AQUAMARINE1  = new ColorImpl("/" + SCHEME + "/aquamarine1");
        public static final Color AQUAMARINE2 = new ColorImpl("/" + SCHEME + "/aquamarine2");
        public static final Color AQUAMARINE3  = new ColorImpl("/" + SCHEME + "/aquamarine3");
        public static final Color AQUAMARINE4  = new ColorImpl("/" + SCHEME + "/aquamarine4");
        public static final Color AZURE  = new ColorImpl("/" + SCHEME + "/azure");
        public static final Color AZURE1  = new ColorImpl("/" + SCHEME + "/azure1");
        public static final Color AZURE2 = new ColorImpl("/" + SCHEME + "/azure2");
        public static final Color AZURE3  = new ColorImpl("/" + SCHEME + "/azure3");
        public static final Color AZURE4  = new ColorImpl("/" + SCHEME + "/azure4");
        public static final Color BEIGE  = new ColorImpl("/" + SCHEME + "/beige");
        public static final Color BISQUE  = new ColorImpl("/" + SCHEME + "/bisque");
        public static final Color BISQUE1 = new ColorImpl("/" + SCHEME + "/bisque1");
        public static final Color BISQUE2  = new ColorImpl("/" + SCHEME + "/bisque2");
        public static final Color BISQUE3  = new ColorImpl("/" + SCHEME + "/bisque3");
        public static final Color BISQUE4  = new ColorImpl("/" + SCHEME + "/bisque4");
        public static final Color BLACK  = new ColorImpl("/" + SCHEME + "/black");
        public static final Color BLANCHEDALMOND = new ColorImpl("/" + SCHEME + "/blanchedalmond");
        public static final Color BLUE  = new ColorImpl("/" + SCHEME + "/blue");
        public static final Color BLUE1  = new ColorImpl("/" + SCHEME + "/blue1");
        public static final Color BLUE2  = new ColorImpl("/" + SCHEME + "/blue2");
        public static final Color BLUE3  = new ColorImpl("/" + SCHEME + "/blue3");
        public static final Color BLUE4 = new ColorImpl("/" + SCHEME + "/blue4");
        public static final Color BLUEVIOLET  = new ColorImpl("/" + SCHEME + "/blueviolet");
        public static final Color BROWN  = new ColorImpl("/" + SCHEME + "/brown");
        public static final Color BROWN1  = new ColorImpl("/" + SCHEME + "/brown1");
        public static final Color BROWN2  = new ColorImpl("/" + SCHEME + "/brown2");
        public static final Color BROWN3 = new ColorImpl("/" + SCHEME + "/brown3");
        public static final Color BROWN4  = new ColorImpl("/" + SCHEME + "/brown4");
        public static final Color BURLYWOOD  = new ColorImpl("/" + SCHEME + "/burlywood");
        public static final Color BURLYWOOD1  = new ColorImpl("/" + SCHEME + "/burlywood1");
        public static final Color BURLYWOOD2  = new ColorImpl("/" + SCHEME + "/burlywood2");
        public static final Color BURLYWOOD3 = new ColorImpl("/" + SCHEME + "/burlywood3");
        public static final Color BURLYWOOD4  = new ColorImpl("/" + SCHEME + "/burlywood4");
        public static final Color CADETBLUE  = new ColorImpl("/" + SCHEME + "/cadetblue");
        public static final Color CADETBLUE1  = new ColorImpl("/" + SCHEME + "/cadetblue1");
        public static final Color CADETBLUE2  = new ColorImpl("/" + SCHEME + "/cadetblue2");
        public static final Color CADETBLUE3 = new ColorImpl("/" + SCHEME + "/cadetblue3");
        public static final Color CADETBLUE4  = new ColorImpl("/" + SCHEME + "/cadetblue4");
        public static final Color CHARTREUSE  = new ColorImpl("/" + SCHEME + "/chartreuse");
        public static final Color CHARTREUSE1  = new ColorImpl("/" + SCHEME + "/chartreuse1");
        public static final Color CHARTREUSE2  = new ColorImpl("/" + SCHEME + "/chartreuse2");
        public static final Color CHARTREUSE3 = new ColorImpl("/" + SCHEME + "/chartreuse3");
        public static final Color CHARTREUSE4  = new ColorImpl("/" + SCHEME + "/chartreuse4");
        public static final Color CHOCOLATE  = new ColorImpl("/" + SCHEME + "/chocolate");
        public static final Color CHOCOLATE1  = new ColorImpl("/" + SCHEME + "/chocolate1");
        public static final Color CHOCOLATE2  = new ColorImpl("/" + SCHEME + "/chocolate2");
        public static final Color CHOCOLATE3 = new ColorImpl("/" + SCHEME + "/chocolate3");
        public static final Color CHOCOLATE4  = new ColorImpl("/" + SCHEME + "/chocolate4");
        public static final Color CORAL  = new ColorImpl("/" + SCHEME + "/coral");
        public static final Color CORAL1  = new ColorImpl("/" + SCHEME + "/coral1");
        public static final Color CORAL2  = new ColorImpl("/" + SCHEME + "/coral2");
        public static final Color CORAL3 = new ColorImpl("/" + SCHEME + "/coral3");
        public static final Color CORAL4  = new ColorImpl("/" + SCHEME + "/coral4");
        public static final Color CORNFLOWERBLUE  = new ColorImpl("/" + SCHEME + "/cornflowerblue");
        public static final Color CORNSILK  = new ColorImpl("/" + SCHEME + "/cornsilk");
        public static final Color CORNSILK1  = new ColorImpl("/" + SCHEME + "/cornsilk1");
        public static final Color CORNSILK2 = new ColorImpl("/" + SCHEME + "/cornsilk2");
        public static final Color CORNSILK3  = new ColorImpl("/" + SCHEME + "/cornsilk3");
        public static final Color CORNSILK4  = new ColorImpl("/" + SCHEME + "/cornsilk4");
        public static final Color CRIMSON  = new ColorImpl("/" + SCHEME + "/crimson");
        public static final Color CYAN  = new ColorImpl("/" + SCHEME + "/cyan");
        public static final Color CYAN1 = new ColorImpl("/" + SCHEME + "/cyan1");
        public static final Color CYAN2  = new ColorImpl("/" + SCHEME + "/cyan2");
        public static final Color CYAN3  = new ColorImpl("/" + SCHEME + "/cyan3");
        public static final Color CYAN4  = new ColorImpl("/" + SCHEME + "/cyan4");
        public static final Color DARKBLUE  = new ColorImpl("/" + SCHEME + "/darkblue");
        public static final Color DARKCYAN = new ColorImpl("/" + SCHEME + "/darkcyan");
        public static final Color DARKGOLDENROD  = new ColorImpl("/" + SCHEME + "/darkgoldenrod");
        public static final Color DARKGOLDENROD1  = new ColorImpl("/" + SCHEME + "/darkgoldenrod1");
        public static final Color DARKGOLDENROD2  = new ColorImpl("/" + SCHEME + "/darkgoldenrod2");
        public static final Color DARKGOLDENROD3  = new ColorImpl("/" + SCHEME + "/darkgoldenrod3");
        public static final Color DARKGOLDENROD4 = new ColorImpl("/" + SCHEME + "/darkgoldenrod4");
        public static final Color DARKGRAY  = new ColorImpl("/" + SCHEME + "/darkgray");
        public static final Color DARKGREEN  = new ColorImpl("/" + SCHEME + "/darkgreen");
        public static final Color DARKGREY  = new ColorImpl("/" + SCHEME + "/darkgrey");
        public static final Color DARKKHAKI  = new ColorImpl("/" + SCHEME + "/darkkhaki");
        public static final Color DARKMAGENTA = new ColorImpl("/" + SCHEME + "/darkmagenta");
        public static final Color DARKOLIVEGREEN  = new ColorImpl("/" + SCHEME + "/darkolivegreen");
        public static final Color DARKOLIVEGREEN1  = new ColorImpl("/" + SCHEME + "/darkolivegreen1");
        public static final Color DARKOLIVEGREEN2  = new ColorImpl("/" + SCHEME + "/darkolivegreen2");
        public static final Color DARKOLIVEGREEN3  = new ColorImpl("/" + SCHEME + "/darkolivegreen3");
        public static final Color DARKOLIVEGREEN4 = new ColorImpl("/" + SCHEME + "/darkolivegreen4");
        public static final Color DARKORANGE  = new ColorImpl("/" + SCHEME + "/darkorange");
        public static final Color DARKORANGE1  = new ColorImpl("/" + SCHEME + "/darkorange1");
        public static final Color DARKORANGE2  = new ColorImpl("/" + SCHEME + "/darkorange2");
        public static final Color DARKORANGE3  = new ColorImpl("/" + SCHEME + "/darkorange3");
        public static final Color DARKORANGE4 = new ColorImpl("/" + SCHEME + "/darkorange4");
        public static final Color DARKORCHID  = new ColorImpl("/" + SCHEME + "/darkorchid");
        public static final Color DARKORCHID1  = new ColorImpl("/" + SCHEME + "/darkorchid1");
        public static final Color DARKORCHID2  = new ColorImpl("/" + SCHEME + "/darkorchid2");
        public static final Color DARKORCHID3  = new ColorImpl("/" + SCHEME + "/darkorchid3");
        public static final Color DARKORCHID4 = new ColorImpl("/" + SCHEME + "/darkorchid4");
        public static final Color DARKRED  = new ColorImpl("/" + SCHEME + "/darkred");
        public static final Color DARKSALMON  = new ColorImpl("/" + SCHEME + "/darksalmon");
        public static final Color DARKSEAGREEN  = new ColorImpl("/" + SCHEME + "/darkseagreen");
        public static final Color DARKSEAGREEN1  = new ColorImpl("/" + SCHEME + "/darkseagreen1");
        public static final Color DARKSEAGREEN2 = new ColorImpl("/" + SCHEME + "/darkseagreen2");
        public static final Color DARKSEAGREEN3  = new ColorImpl("/" + SCHEME + "/darkseagreen3");
        public static final Color DARKSEAGREEN4  = new ColorImpl("/" + SCHEME + "/darkseagreen4");
        public static final Color DARKSLATEBLUE  = new ColorImpl("/" + SCHEME + "/darkslateblue");
        public static final Color DARKSLATEGRAY  = new ColorImpl("/" + SCHEME + "/darkslategray");
        public static final Color DARKSLATEGRAY1 = new ColorImpl("/" + SCHEME + "/darkslategray1");
        public static final Color DARKSLATEGRAY2  = new ColorImpl("/" + SCHEME + "/darkslategray2");
        public static final Color DARKSLATEGRAY3  = new ColorImpl("/" + SCHEME + "/darkslategray3");
        public static final Color DARKSLATEGRAY4  = new ColorImpl("/" + SCHEME + "/darkslategray4");
        public static final Color DARKSLATEGREY  = new ColorImpl("/" + SCHEME + "/darkslategrey");
        public static final Color DARKTURQUOISE = new ColorImpl("/" + SCHEME + "/darkturquoise");
        public static final Color DARKVIOLET  = new ColorImpl("/" + SCHEME + "/darkviolet");
        public static final Color DEEPPINK  = new ColorImpl("/" + SCHEME + "/deeppink");
        public static final Color DEEPPINK1  = new ColorImpl("/" + SCHEME + "/deeppink1");
        public static final Color DEEPPINK2  = new ColorImpl("/" + SCHEME + "/deeppink2");
        public static final Color DEEPPINK3 = new ColorImpl("/" + SCHEME + "/deeppink3");
        public static final Color DEEPPINK4  = new ColorImpl("/" + SCHEME + "/deeppink4");
        public static final Color DEEPSKYBLUE  = new ColorImpl("/" + SCHEME + "/deepskyblue");
        public static final Color DEEPSKYBLUE1  = new ColorImpl("/" + SCHEME + "/deepskyblue1");
        public static final Color DEEPSKYBLUE2  = new ColorImpl("/" + SCHEME + "/deepskyblue2");
        public static final Color DEEPSKYBLUE3 = new ColorImpl("/" + SCHEME + "/deepskyblue3");
        public static final Color DEEPSKYBLUE4  = new ColorImpl("/" + SCHEME + "/deepskyblue4");
        public static final Color DIMGRAY  = new ColorImpl("/" + SCHEME + "/dimgray");
        public static final Color DIMGREY  = new ColorImpl("/" + SCHEME + "/dimgrey");
        public static final Color DODGERBLUE  = new ColorImpl("/" + SCHEME + "/dodgerblue");
        public static final Color DODGERBLUE1 = new ColorImpl("/" + SCHEME + "/dodgerblue1");
        public static final Color DODGERBLUE2  = new ColorImpl("/" + SCHEME + "/dodgerblue2");
        public static final Color DODGERBLUE3  = new ColorImpl("/" + SCHEME + "/dodgerblue3");
        public static final Color DODGERBLUE4  = new ColorImpl("/" + SCHEME + "/dodgerblue4");
        public static final Color FIREBRICK  = new ColorImpl("/" + SCHEME + "/firebrick");
        public static final Color FIREBRICK1 = new ColorImpl("/" + SCHEME + "/firebrick1");
        public static final Color FIREBRICK2  = new ColorImpl("/" + SCHEME + "/firebrick2");
        public static final Color FIREBRICK3  = new ColorImpl("/" + SCHEME + "/firebrick3");
        public static final Color FIREBRICK4  = new ColorImpl("/" + SCHEME + "/firebrick4");
        public static final Color FLORALWHITE  = new ColorImpl("/" + SCHEME + "/floralwhite");
        public static final Color FORESTGREEN = new ColorImpl("/" + SCHEME + "/forestgreen");
        public static final Color FUCHSIA  = new ColorImpl("/" + SCHEME + "/fuchsia");
        public static final Color GAINSBORO  = new ColorImpl("/" + SCHEME + "/gainsboro");
        public static final Color GHOSTWHITE  = new ColorImpl("/" + SCHEME + "/ghostwhite");
        public static final Color GOLD  = new ColorImpl("/" + SCHEME + "/gold");
        public static final Color GOLD1 = new ColorImpl("/" + SCHEME + "/gold1");
        public static final Color GOLD2  = new ColorImpl("/" + SCHEME + "/gold2");
        public static final Color GOLD3  = new ColorImpl("/" + SCHEME + "/gold3");
        public static final Color GOLD4  = new ColorImpl("/" + SCHEME + "/gold4");
        public static final Color GOLDENROD  = new ColorImpl("/" + SCHEME + "/goldenrod");
        public static final Color GOLDENROD1 = new ColorImpl("/" + SCHEME + "/goldenrod1");
        public static final Color GOLDENROD2  = new ColorImpl("/" + SCHEME + "/goldenrod2");
        public static final Color GOLDENROD3  = new ColorImpl("/" + SCHEME + "/goldenrod3");
        public static final Color GOLDENROD4  = new ColorImpl("/" + SCHEME + "/goldenrod4");
        public static final Color GRAY  = new ColorImpl("/" + SCHEME + "/gray");
        public static final Color GRAY0 = new ColorImpl("/" + SCHEME + "/gray0");
        public static final Color GRAY1  = new ColorImpl("/" + SCHEME + "/gray1");
        public static final Color GRAY10  = new ColorImpl("/" + SCHEME + "/gray10");
        public static final Color GRAY100  = new ColorImpl("/" + SCHEME + "/gray100");
        public static final Color GRAY11  = new ColorImpl("/" + SCHEME + "/gray11");
        public static final Color GRAY12 = new ColorImpl("/" + SCHEME + "/gray12");
        public static final Color GRAY13  = new ColorImpl("/" + SCHEME + "/gray13");
        public static final Color GRAY14  = new ColorImpl("/" + SCHEME + "/gray14");
        public static final Color GRAY15  = new ColorImpl("/" + SCHEME + "/gray15");
        public static final Color GRAY16  = new ColorImpl("/" + SCHEME + "/gray16");
        public static final Color GRAY17 = new ColorImpl("/" + SCHEME + "/gray17");
        public static final Color GRAY18  = new ColorImpl("/" + SCHEME + "/gray18");
        public static final Color GRAY19  = new ColorImpl("/" + SCHEME + "/gray19");
        public static final Color GRAY2  = new ColorImpl("/" + SCHEME + "/gray2");
        public static final Color GRAY20  = new ColorImpl("/" + SCHEME + "/gray20");
        public static final Color GRAY21 = new ColorImpl("/" + SCHEME + "/gray21");
        public static final Color GRAY22  = new ColorImpl("/" + SCHEME + "/gray22");
        public static final Color GRAY23  = new ColorImpl("/" + SCHEME + "/gray23");
        public static final Color GRAY24  = new ColorImpl("/" + SCHEME + "/gray24");
        public static final Color GRAY25  = new ColorImpl("/" + SCHEME + "/gray25");
        public static final Color GRAY26 = new ColorImpl("/" + SCHEME + "/gray26");
        public static final Color GRAY27  = new ColorImpl("/" + SCHEME + "/gray27");
        public static final Color GRAY28  = new ColorImpl("/" + SCHEME + "/gray28");
        public static final Color GRAY29  = new ColorImpl("/" + SCHEME + "/gray29");
        public static final Color GRAY3  = new ColorImpl("/" + SCHEME + "/gray3");
        public static final Color GRAY30 = new ColorImpl("/" + SCHEME + "/gray30");
        public static final Color GRAY31  = new ColorImpl("/" + SCHEME + "/gray31");
        public static final Color GRAY32  = new ColorImpl("/" + SCHEME + "/gray32");
        public static final Color GRAY33  = new ColorImpl("/" + SCHEME + "/gray33");
        public static final Color GRAY34  = new ColorImpl("/" + SCHEME + "/gray34");
        public static final Color GRAY35 = new ColorImpl("/" + SCHEME + "/gray35");
        public static final Color GRAY36  = new ColorImpl("/" + SCHEME + "/gray36");
        public static final Color GRAY37  = new ColorImpl("/" + SCHEME + "/gray37");
        public static final Color GRAY38  = new ColorImpl("/" + SCHEME + "/gray38");
        public static final Color GRAY39  = new ColorImpl("/" + SCHEME + "/gray39");
        public static final Color GRAY4 = new ColorImpl("/" + SCHEME + "/gray4");
        public static final Color GRAY40  = new ColorImpl("/" + SCHEME + "/gray40");
        public static final Color GRAY41  = new ColorImpl("/" + SCHEME + "/gray41");
        public static final Color GRAY42  = new ColorImpl("/" + SCHEME + "/gray42");
        public static final Color GRAY43  = new ColorImpl("/" + SCHEME + "/gray43");
        public static final Color GRAY44 = new ColorImpl("/" + SCHEME + "/gray44");
        public static final Color GRAY45  = new ColorImpl("/" + SCHEME + "/gray45");
        public static final Color GRAY46  = new ColorImpl("/" + SCHEME + "/gray46");
        public static final Color GRAY47  = new ColorImpl("/" + SCHEME + "/gray47");
        public static final Color GRAY48  = new ColorImpl("/" + SCHEME + "/gray48");
        public static final Color GRAY49 = new ColorImpl("/" + SCHEME + "/gray49");
        public static final Color GRAY5  = new ColorImpl("/" + SCHEME + "/gray5");
        public static final Color GRAY50  = new ColorImpl("/" + SCHEME + "/gray50");
        public static final Color GRAY51  = new ColorImpl("/" + SCHEME + "/gray51");
        public static final Color GRAY52  = new ColorImpl("/" + SCHEME + "/gray52");
        public static final Color GRAY53 = new ColorImpl("/" + SCHEME + "/gray53");
        public static final Color GRAY54  = new ColorImpl("/" + SCHEME + "/gray54");
        public static final Color GRAY55  = new ColorImpl("/" + SCHEME + "/gray55");
        public static final Color GRAY56  = new ColorImpl("/" + SCHEME + "/gray56");
        public static final Color GRAY57  = new ColorImpl("/" + SCHEME + "/gray57");
        public static final Color GRAY58 = new ColorImpl("/" + SCHEME + "/gray58");
        public static final Color GRAY59  = new ColorImpl("/" + SCHEME + "/gray59");
        public static final Color GRAY6  = new ColorImpl("/" + SCHEME + "/gray6");
        public static final Color GRAY60  = new ColorImpl("/" + SCHEME + "/gray60");
        public static final Color GRAY61  = new ColorImpl("/" + SCHEME + "/gray61");
        public static final Color GRAY62 = new ColorImpl("/" + SCHEME + "/gray62");
        public static final Color GRAY63  = new ColorImpl("/" + SCHEME + "/gray63");
        public static final Color GRAY64  = new ColorImpl("/" + SCHEME + "/gray64");
        public static final Color GRAY65  = new ColorImpl("/" + SCHEME + "/gray65");
        public static final Color GRAY66  = new ColorImpl("/" + SCHEME + "/gray66");
        public static final Color GRAY67 = new ColorImpl("/" + SCHEME + "/gray67");
        public static final Color GRAY68  = new ColorImpl("/" + SCHEME + "/gray68");
        public static final Color GRAY69  = new ColorImpl("/" + SCHEME + "/gray69");
        public static final Color GRAY7  = new ColorImpl("/" + SCHEME + "/gray7");
        public static final Color GRAY70  = new ColorImpl("/" + SCHEME + "/gray70");
        public static final Color GRAY71 = new ColorImpl("/" + SCHEME + "/gray71");
        public static final Color GRAY72  = new ColorImpl("/" + SCHEME + "/gray72");
        public static final Color GRAY73  = new ColorImpl("/" + SCHEME + "/gray73");
        public static final Color GRAY74  = new ColorImpl("/" + SCHEME + "/gray74");
        public static final Color GRAY75  = new ColorImpl("/" + SCHEME + "/gray75");
        public static final Color GRAY76 = new ColorImpl("/" + SCHEME + "/gray76");
        public static final Color GRAY77  = new ColorImpl("/" + SCHEME + "/gray77");
        public static final Color GRAY78  = new ColorImpl("/" + SCHEME + "/gray78");
        public static final Color GRAY79  = new ColorImpl("/" + SCHEME + "/gray79");
        public static final Color GRAY8  = new ColorImpl("/" + SCHEME + "/gray8");
        public static final Color GRAY80 = new ColorImpl("/" + SCHEME + "/gray80");
        public static final Color GRAY81  = new ColorImpl("/" + SCHEME + "/gray81");
        public static final Color GRAY82  = new ColorImpl("/" + SCHEME + "/gray82");
        public static final Color GRAY83  = new ColorImpl("/" + SCHEME + "/gray83");
        public static final Color GRAY84  = new ColorImpl("/" + SCHEME + "/gray84");
        public static final Color GRAY85 = new ColorImpl("/" + SCHEME + "/gray85");
        public static final Color GRAY86  = new ColorImpl("/" + SCHEME + "/gray86");
        public static final Color GRAY87  = new ColorImpl("/" + SCHEME + "/gray87");
        public static final Color GRAY88  = new ColorImpl("/" + SCHEME + "/gray88");
        public static final Color GRAY89  = new ColorImpl("/" + SCHEME + "/gray89");
        public static final Color GRAY9 = new ColorImpl("/" + SCHEME + "/gray9");
        public static final Color GRAY90  = new ColorImpl("/" + SCHEME + "/gray90");
        public static final Color GRAY91  = new ColorImpl("/" + SCHEME + "/gray91");
        public static final Color GRAY92  = new ColorImpl("/" + SCHEME + "/gray92");
        public static final Color GRAY93  = new ColorImpl("/" + SCHEME + "/gray93");
        public static final Color GRAY94 = new ColorImpl("/" + SCHEME + "/gray94");
        public static final Color GRAY95  = new ColorImpl("/" + SCHEME + "/gray95");
        public static final Color GRAY96  = new ColorImpl("/" + SCHEME + "/gray96");
        public static final Color GRAY97  = new ColorImpl("/" + SCHEME + "/gray97");
        public static final Color GRAY98  = new ColorImpl("/" + SCHEME + "/gray98");
        public static final Color GRAY99 = new ColorImpl("/" + SCHEME + "/gray99");
        public static final Color GREEN  = new ColorImpl("/" + SCHEME + "/green");
        public static final Color GREEN1  = new ColorImpl("/" + SCHEME + "/green1");
        public static final Color GREEN2  = new ColorImpl("/" + SCHEME + "/green2");
        public static final Color GREEN3  = new ColorImpl("/" + SCHEME + "/green3");
        public static final Color GREEN4 = new ColorImpl("/" + SCHEME + "/green4");
        public static final Color GREENYELLOW  = new ColorImpl("/" + SCHEME + "/greenyellow");
        public static final Color GREY  = new ColorImpl("/" + SCHEME + "/grey");
        public static final Color GREY0  = new ColorImpl("/" + SCHEME + "/grey0");
        public static final Color GREY1  = new ColorImpl("/" + SCHEME + "/grey1");
        public static final Color GREY10 = new ColorImpl("/" + SCHEME + "/grey10");
        public static final Color GREY100  = new ColorImpl("/" + SCHEME + "/grey100");
        public static final Color GREY11  = new ColorImpl("/" + SCHEME + "/grey11");
        public static final Color GREY12  = new ColorImpl("/" + SCHEME + "/grey12");
        public static final Color GREY13  = new ColorImpl("/" + SCHEME + "/grey13");
        public static final Color GREY14 = new ColorImpl("/" + SCHEME + "/grey14");
        public static final Color GREY15  = new ColorImpl("/" + SCHEME + "/grey15");
        public static final Color GREY16  = new ColorImpl("/" + SCHEME + "/grey16");
        public static final Color GREY17  = new ColorImpl("/" + SCHEME + "/grey17");
        public static final Color GREY18  = new ColorImpl("/" + SCHEME + "/grey18");
        public static final Color GREY19 = new ColorImpl("/" + SCHEME + "/grey19");
        public static final Color GREY2  = new ColorImpl("/" + SCHEME + "/grey2");
        public static final Color GREY20  = new ColorImpl("/" + SCHEME + "/grey20");
        public static final Color GREY21  = new ColorImpl("/" + SCHEME + "/grey21");
        public static final Color GREY22  = new ColorImpl("/" + SCHEME + "/grey22");
        public static final Color GREY23 = new ColorImpl("/" + SCHEME + "/grey23");
        public static final Color GREY24  = new ColorImpl("/" + SCHEME + "/grey24");
        public static final Color GREY25  = new ColorImpl("/" + SCHEME + "/grey25");
        public static final Color GREY26  = new ColorImpl("/" + SCHEME + "/grey26");
        public static final Color GREY27  = new ColorImpl("/" + SCHEME + "/grey27");
        public static final Color GREY28 = new ColorImpl("/" + SCHEME + "/grey28");
        public static final Color GREY29  = new ColorImpl("/" + SCHEME + "/grey29");
        public static final Color GREY3  = new ColorImpl("/" + SCHEME + "/grey3");
        public static final Color GREY30  = new ColorImpl("/" + SCHEME + "/grey30");
        public static final Color GREY31  = new ColorImpl("/" + SCHEME + "/grey31");
        public static final Color GREY32 = new ColorImpl("/" + SCHEME + "/grey32");
        public static final Color GREY33  = new ColorImpl("/" + SCHEME + "/grey33");
        public static final Color GREY34  = new ColorImpl("/" + SCHEME + "/grey34");
        public static final Color GREY35  = new ColorImpl("/" + SCHEME + "/grey35");
        public static final Color GREY36  = new ColorImpl("/" + SCHEME + "/grey36");
        public static final Color GREY37 = new ColorImpl("/" + SCHEME + "/grey37");
        public static final Color GREY38  = new ColorImpl("/" + SCHEME + "/grey38");
        public static final Color GREY39  = new ColorImpl("/" + SCHEME + "/grey39");
        public static final Color GREY4  = new ColorImpl("/" + SCHEME + "/grey4");
        public static final Color GREY40  = new ColorImpl("/" + SCHEME + "/grey40");
        public static final Color GREY41 = new ColorImpl("/" + SCHEME + "/grey41");
        public static final Color GREY42  = new ColorImpl("/" + SCHEME + "/grey42");
        public static final Color GREY43  = new ColorImpl("/" + SCHEME + "/grey43");
        public static final Color GREY44  = new ColorImpl("/" + SCHEME + "/grey44");
        public static final Color GREY45  = new ColorImpl("/" + SCHEME + "/grey45");
        public static final Color GREY46 = new ColorImpl("/" + SCHEME + "/grey46");
        public static final Color GREY47  = new ColorImpl("/" + SCHEME + "/grey47");
        public static final Color GREY48  = new ColorImpl("/" + SCHEME + "/grey48");
        public static final Color GREY49  = new ColorImpl("/" + SCHEME + "/grey49");
        public static final Color GREY5  = new ColorImpl("/" + SCHEME + "/grey5");
        public static final Color GREY50 = new ColorImpl("/" + SCHEME + "/grey50");
        public static final Color GREY51  = new ColorImpl("/" + SCHEME + "/grey51");
        public static final Color GREY52  = new ColorImpl("/" + SCHEME + "/grey52");
        public static final Color GREY53  = new ColorImpl("/" + SCHEME + "/grey53");
        public static final Color GREY54  = new ColorImpl("/" + SCHEME + "/grey54");
        public static final Color GREY55 = new ColorImpl("/" + SCHEME + "/grey55");
        public static final Color GREY56  = new ColorImpl("/" + SCHEME + "/grey56");
        public static final Color GREY57  = new ColorImpl("/" + SCHEME + "/grey57");
        public static final Color GREY58  = new ColorImpl("/" + SCHEME + "/grey58");
        public static final Color GREY59  = new ColorImpl("/" + SCHEME + "/grey59");
        public static final Color GREY6 = new ColorImpl("/" + SCHEME + "/grey6");
        public static final Color GREY60  = new ColorImpl("/" + SCHEME + "/grey60");
        public static final Color GREY61  = new ColorImpl("/" + SCHEME + "/grey61");
        public static final Color GREY62  = new ColorImpl("/" + SCHEME + "/grey62");
        public static final Color GREY63  = new ColorImpl("/" + SCHEME + "/grey63");
        public static final Color GREY64 = new ColorImpl("/" + SCHEME + "/grey64");
        public static final Color GREY65  = new ColorImpl("/" + SCHEME + "/grey65");
        public static final Color GREY66  = new ColorImpl("/" + SCHEME + "/grey66");
        public static final Color GREY67  = new ColorImpl("/" + SCHEME + "/grey67");
        public static final Color GREY68  = new ColorImpl("/" + SCHEME + "/grey68");
        public static final Color GREY69 = new ColorImpl("/" + SCHEME + "/grey69");
        public static final Color GREY7  = new ColorImpl("/" + SCHEME + "/grey7");
        public static final Color GREY70  = new ColorImpl("/" + SCHEME + "/grey70");
        public static final Color GREY71  = new ColorImpl("/" + SCHEME + "/grey71");
        public static final Color GREY72  = new ColorImpl("/" + SCHEME + "/grey72");
        public static final Color GREY73 = new ColorImpl("/" + SCHEME + "/grey73");
        public static final Color GREY74  = new ColorImpl("/" + SCHEME + "/grey74");
        public static final Color GREY75  = new ColorImpl("/" + SCHEME + "/grey75");
        public static final Color GREY76  = new ColorImpl("/" + SCHEME + "/grey76");
        public static final Color GREY77  = new ColorImpl("/" + SCHEME + "/grey77");
        public static final Color GREY78 = new ColorImpl("/" + SCHEME + "/grey78");
        public static final Color GREY79  = new ColorImpl("/" + SCHEME + "/grey79");
        public static final Color GREY8  = new ColorImpl("/" + SCHEME + "/grey8");
        public static final Color GREY80  = new ColorImpl("/" + SCHEME + "/grey80");
        public static final Color GREY81  = new ColorImpl("/" + SCHEME + "/grey81");
        public static final Color GREY82 = new ColorImpl("/" + SCHEME + "/grey82");
        public static final Color GREY83  = new ColorImpl("/" + SCHEME + "/grey83");
        public static final Color GREY84  = new ColorImpl("/" + SCHEME + "/grey84");
        public static final Color GREY85  = new ColorImpl("/" + SCHEME + "/grey85");
        public static final Color GREY86  = new ColorImpl("/" + SCHEME + "/grey86");
        public static final Color GREY87 = new ColorImpl("/" + SCHEME + "/grey87");
        public static final Color GREY88  = new ColorImpl("/" + SCHEME + "/grey88");
        public static final Color GREY89  = new ColorImpl("/" + SCHEME + "/grey89");
        public static final Color GREY9  = new ColorImpl("/" + SCHEME + "/grey9");
        public static final Color GREY90  = new ColorImpl("/" + SCHEME + "/grey90");
        public static final Color GREY91 = new ColorImpl("/" + SCHEME + "/grey91");
        public static final Color GREY92  = new ColorImpl("/" + SCHEME + "/grey92");
        public static final Color GREY93  = new ColorImpl("/" + SCHEME + "/grey93");
        public static final Color GREY94  = new ColorImpl("/" + SCHEME + "/grey94");
        public static final Color GREY95  = new ColorImpl("/" + SCHEME + "/grey95");
        public static final Color GREY96 = new ColorImpl("/" + SCHEME + "/grey96");
        public static final Color GREY97  = new ColorImpl("/" + SCHEME + "/grey97");
        public static final Color GREY98  = new ColorImpl("/" + SCHEME + "/grey98");
        public static final Color GREY99  = new ColorImpl("/" + SCHEME + "/grey99");
        public static final Color HONEYDEW  = new ColorImpl("/" + SCHEME + "/honeydew");
        public static final Color HONEYDEW1 = new ColorImpl("/" + SCHEME + "/honeydew1");
        public static final Color HONEYDEW2  = new ColorImpl("/" + SCHEME + "/honeydew2");
        public static final Color HONEYDEW3  = new ColorImpl("/" + SCHEME + "/honeydew3");
        public static final Color HONEYDEW4  = new ColorImpl("/" + SCHEME + "/honeydew4");
        public static final Color HOTPINK  = new ColorImpl("/" + SCHEME + "/hotpink");
        public static final Color HOTPINK1 = new ColorImpl("/" + SCHEME + "/hotpink1");
        public static final Color HOTPINK2  = new ColorImpl("/" + SCHEME + "/hotpink2");
        public static final Color HOTPINK3  = new ColorImpl("/" + SCHEME + "/hotpink3");
        public static final Color HOTPINK4  = new ColorImpl("/" + SCHEME + "/hotpink4");
        public static final Color INDIANRED  = new ColorImpl("/" + SCHEME + "/indianred");
        public static final Color INDIANRED1 = new ColorImpl("/" + SCHEME + "/indianred1");
        public static final Color INDIANRED2  = new ColorImpl("/" + SCHEME + "/indianred2");
        public static final Color INDIANRED3  = new ColorImpl("/" + SCHEME + "/indianred3");
        public static final Color INDIANRED4  = new ColorImpl("/" + SCHEME + "/indianred4");
        public static final Color INDIGO  = new ColorImpl("/" + SCHEME + "/indigo");
        public static final Color INVIS = new ColorImpl("/" + SCHEME + "/invis");
        public static final Color IVORY  = new ColorImpl("/" + SCHEME + "/ivory");
        public static final Color IVORY1  = new ColorImpl("/" + SCHEME + "/ivory1");
        public static final Color IVORY2  = new ColorImpl("/" + SCHEME + "/ivory2");
        public static final Color IVORY3  = new ColorImpl("/" + SCHEME + "/ivory3");
        public static final Color IVORY4 = new ColorImpl("/" + SCHEME + "/ivory4");
        public static final Color KHAKI  = new ColorImpl("/" + SCHEME + "/khaki");
        public static final Color KHAKI1  = new ColorImpl("/" + SCHEME + "/khaki1");
        public static final Color KHAKI2  = new ColorImpl("/" + SCHEME + "/khaki2");
        public static final Color KHAKI3  = new ColorImpl("/" + SCHEME + "/khaki3");
        public static final Color KHAKI4 = new ColorImpl("/" + SCHEME + "/khaki4");
        public static final Color LAVENDER  = new ColorImpl("/" + SCHEME + "/lavender");
        public static final Color LAVENDERBLUSH  = new ColorImpl("/" + SCHEME + "/lavenderblush");
        public static final Color LAVENDERBLUSH1  = new ColorImpl("/" + SCHEME + "/lavenderblush1");
        public static final Color LAVENDERBLUSH2  = new ColorImpl("/" + SCHEME + "/lavenderblush2");
        public static final Color LAVENDERBLUSH3 = new ColorImpl("/" + SCHEME + "/lavenderblush3");
        public static final Color LAVENDERBLUSH4  = new ColorImpl("/" + SCHEME + "/lavenderblush4");
        public static final Color LAWNGREEN  = new ColorImpl("/" + SCHEME + "/lawngreen");
        public static final Color LEMONCHIFFON  = new ColorImpl("/" + SCHEME + "/lemonchiffon");
        public static final Color LEMONCHIFFON1  = new ColorImpl("/" + SCHEME + "/lemonchiffon1");
        public static final Color LEMONCHIFFON2 = new ColorImpl("/" + SCHEME + "/lemonchiffon2");
        public static final Color LEMONCHIFFON3  = new ColorImpl("/" + SCHEME + "/lemonchiffon3");
        public static final Color LEMONCHIFFON4  = new ColorImpl("/" + SCHEME + "/lemonchiffon4");
        public static final Color LIGHTBLUE  = new ColorImpl("/" + SCHEME + "/lightblue");
        public static final Color LIGHTBLUE1  = new ColorImpl("/" + SCHEME + "/lightblue1");
        public static final Color LIGHTBLUE2 = new ColorImpl("/" + SCHEME + "/lightblue2");
        public static final Color LIGHTBLUE3  = new ColorImpl("/" + SCHEME + "/lightblue3");
        public static final Color LIGHTBLUE4  = new ColorImpl("/" + SCHEME + "/lightblue4");
        public static final Color LIGHTCORAL  = new ColorImpl("/" + SCHEME + "/lightcoral");
        public static final Color LIGHTCYAN  = new ColorImpl("/" + SCHEME + "/lightcyan");
        public static final Color LIGHTCYAN1 = new ColorImpl("/" + SCHEME + "/lightcyan1");
        public static final Color LIGHTCYAN2  = new ColorImpl("/" + SCHEME + "/lightcyan2");
        public static final Color LIGHTCYAN3  = new ColorImpl("/" + SCHEME + "/lightcyan3");
        public static final Color LIGHTCYAN4  = new ColorImpl("/" + SCHEME + "/lightcyan4");
        public static final Color LIGHTGOLDENROD  = new ColorImpl("/" + SCHEME + "/lightgoldenrod");
        public static final Color LIGHTGOLDENROD1 = new ColorImpl("/" + SCHEME + "/lightgoldenrod1");
        public static final Color LIGHTGOLDENROD2  = new ColorImpl("/" + SCHEME + "/lightgoldenrod2");
        public static final Color LIGHTGOLDENROD3  = new ColorImpl("/" + SCHEME + "/lightgoldenrod3");
        public static final Color LIGHTGOLDENROD4  = new ColorImpl("/" + SCHEME + "/lightgoldenrod4");
        public static final Color LIGHTGOLDENRODYELLOW  = new ColorImpl("/" + SCHEME + "/lightgoldenrodyellow");
        public static final Color LIGHTGRAY = new ColorImpl("/" + SCHEME + "/lightgray");
        public static final Color LIGHTGREEN  = new ColorImpl("/" + SCHEME + "/lightgreen");
        public static final Color LIGHTGREY  = new ColorImpl("/" + SCHEME + "/lightgrey");
        public static final Color LIGHTPINK  = new ColorImpl("/" + SCHEME + "/lightpink");
        public static final Color LIGHTPINK1  = new ColorImpl("/" + SCHEME + "/lightpink1");
        public static final Color LIGHTPINK2 = new ColorImpl("/" + SCHEME + "/lightpink2");
        public static final Color LIGHTPINK3  = new ColorImpl("/" + SCHEME + "/lightpink3");
        public static final Color LIGHTPINK4  = new ColorImpl("/" + SCHEME + "/lightpink4");
        public static final Color LIGHTSALMON  = new ColorImpl("/" + SCHEME + "/lightsalmon");
        public static final Color LIGHTSALMON1  = new ColorImpl("/" + SCHEME + "/lightsalmon1");
        public static final Color LIGHTSALMON2 = new ColorImpl("/" + SCHEME + "/lightsalmon2");
        public static final Color LIGHTSALMON3  = new ColorImpl("/" + SCHEME + "/lightsalmon3");
        public static final Color LIGHTSALMON4  = new ColorImpl("/" + SCHEME + "/lightsalmon4");
        public static final Color LIGHTSEAGREEN  = new ColorImpl("/" + SCHEME + "/lightseagreen");
        public static final Color LIGHTSKYBLUE  = new ColorImpl("/" + SCHEME + "/lightskyblue");
        public static final Color LIGHTSKYBLUE1 = new ColorImpl("/" + SCHEME + "/lightskyblue1");
        public static final Color LIGHTSKYBLUE2  = new ColorImpl("/" + SCHEME + "/lightskyblue2");
        public static final Color LIGHTSKYBLUE3  = new ColorImpl("/" + SCHEME + "/lightskyblue3");
        public static final Color LIGHTSKYBLUE4  = new ColorImpl("/" + SCHEME + "/lightskyblue4");
        public static final Color LIGHTSLATEBLUE  = new ColorImpl("/" + SCHEME + "/lightslateblue");
        public static final Color LIGHTSLATEGRAY = new ColorImpl("/" + SCHEME + "/lightslategray");
        public static final Color LIGHTSLATEGREY  = new ColorImpl("/" + SCHEME + "/lightslategrey");
        public static final Color LIGHTSTEELBLUE  = new ColorImpl("/" + SCHEME + "/lightsteelblue");
        public static final Color LIGHTSTEELBLUE1  = new ColorImpl("/" + SCHEME + "/lightsteelblue1");
        public static final Color LIGHTSTEELBLUE2  = new ColorImpl("/" + SCHEME + "/lightsteelblue2");
        public static final Color LIGHTSTEELBLUE3 = new ColorImpl("/" + SCHEME + "/lightsteelblue3");
        public static final Color LIGHTSTEELBLUE4  = new ColorImpl("/" + SCHEME + "/lightsteelblue4");
        public static final Color LIGHTYELLOW  = new ColorImpl("/" + SCHEME + "/lightyellow");
        public static final Color LIGHTYELLOW1  = new ColorImpl("/" + SCHEME + "/lightyellow1");
        public static final Color LIGHTYELLOW2  = new ColorImpl("/" + SCHEME + "/lightyellow2");
        public static final Color LIGHTYELLOW3 = new ColorImpl("/" + SCHEME + "/lightyellow3");
        public static final Color LIGHTYELLOW4  = new ColorImpl("/" + SCHEME + "/lightyellow4");
        public static final Color LIME  = new ColorImpl("/" + SCHEME + "/lime");
        public static final Color LIMEGREEN  = new ColorImpl("/" + SCHEME + "/limegreen");
        public static final Color LINEN  = new ColorImpl("/" + SCHEME + "/linen");
        public static final Color MAGENTA = new ColorImpl("/" + SCHEME + "/magenta");
        public static final Color MAGENTA1  = new ColorImpl("/" + SCHEME + "/magenta1");
        public static final Color MAGENTA2  = new ColorImpl("/" + SCHEME + "/magenta2");
        public static final Color MAGENTA3  = new ColorImpl("/" + SCHEME + "/magenta3");
        public static final Color MAGENTA4  = new ColorImpl("/" + SCHEME + "/magenta4");
        public static final Color MAROON = new ColorImpl("/" + SCHEME + "/maroon");
        public static final Color MAROON1  = new ColorImpl("/" + SCHEME + "/maroon1");
        public static final Color MAROON2  = new ColorImpl("/" + SCHEME + "/maroon2");
        public static final Color MAROON3  = new ColorImpl("/" + SCHEME + "/maroon3");
        public static final Color MAROON4  = new ColorImpl("/" + SCHEME + "/maroon4");
        public static final Color MEDIUMAQUAMARINE = new ColorImpl("/" + SCHEME + "/mediumaquamarine");
        public static final Color MEDIUMBLUE  = new ColorImpl("/" + SCHEME + "/mediumblue");
        public static final Color MEDIUMORCHID  = new ColorImpl("/" + SCHEME + "/mediumorchid");
        public static final Color MEDIUMORCHID1  = new ColorImpl("/" + SCHEME + "/mediumorchid1");
        public static final Color MEDIUMORCHID2  = new ColorImpl("/" + SCHEME + "/mediumorchid2");
        public static final Color MEDIUMORCHID3 = new ColorImpl("/" + SCHEME + "/mediumorchid3");
        public static final Color MEDIUMORCHID4  = new ColorImpl("/" + SCHEME + "/mediumorchid4");
        public static final Color MEDIUMPURPLE  = new ColorImpl("/" + SCHEME + "/mediumpurple");
        public static final Color MEDIUMPURPLE1  = new ColorImpl("/" + SCHEME + "/mediumpurple1");
        public static final Color MEDIUMPURPLE2  = new ColorImpl("/" + SCHEME + "/mediumpurple2");
        public static final Color MEDIUMPURPLE3 = new ColorImpl("/" + SCHEME + "/mediumpurple3");
        public static final Color MEDIUMPURPLE4  = new ColorImpl("/" + SCHEME + "/mediumpurple4");
        public static final Color MEDIUMSEAGREEN  = new ColorImpl("/" + SCHEME + "/mediumseagreen");
        public static final Color MEDIUMSLATEBLUE  = new ColorImpl("/" + SCHEME + "/mediumslateblue");
        public static final Color MEDIUMSPRINGGREEN  = new ColorImpl("/" + SCHEME + "/mediumspringgreen");
        public static final Color MEDIUMTURQUOISE = new ColorImpl("/" + SCHEME + "/mediumturquoise");
        public static final Color MEDIUMVIOLETRED  = new ColorImpl("/" + SCHEME + "/mediumvioletred");
        public static final Color MIDNIGHTBLUE  = new ColorImpl("/" + SCHEME + "/midnightblue");
        public static final Color MINTCREAM  = new ColorImpl("/" + SCHEME + "/mintcream");
        public static final Color MISTYROSE  = new ColorImpl("/" + SCHEME + "/mistyrose");
        public static final Color MISTYROSE1 = new ColorImpl("/" + SCHEME + "/mistyrose1");
        public static final Color MISTYROSE2  = new ColorImpl("/" + SCHEME + "/mistyrose2");
        public static final Color MISTYROSE3  = new ColorImpl("/" + SCHEME + "/mistyrose3");
        public static final Color MISTYROSE4  = new ColorImpl("/" + SCHEME + "/mistyrose4");
        public static final Color MOCCASIN  = new ColorImpl("/" + SCHEME + "/moccasin");
        public static final Color NAVAJOWHITE = new ColorImpl("/" + SCHEME + "/navajowhite");
        public static final Color NAVAJOWHITE1  = new ColorImpl("/" + SCHEME + "/navajowhite1");
        public static final Color NAVAJOWHITE2  = new ColorImpl("/" + SCHEME + "/navajowhite2");
        public static final Color NAVAJOWHITE3  = new ColorImpl("/" + SCHEME + "/navajowhite3");
        public static final Color NAVAJOWHITE4  = new ColorImpl("/" + SCHEME + "/navajowhite4");
        public static final Color NAVY = new ColorImpl("/" + SCHEME + "/navy");
        public static final Color NAVYBLUE  = new ColorImpl("/" + SCHEME + "/navyblue");
        public static final Color NONE  = new ColorImpl("/" + SCHEME + "/none");
        public static final Color OLDLACE  = new ColorImpl("/" + SCHEME + "/oldlace");
        public static final Color OLIVE  = new ColorImpl("/" + SCHEME + "/olive");
        public static final Color OLIVEDRAB = new ColorImpl("/" + SCHEME + "/olivedrab");
        public static final Color OLIVEDRAB1  = new ColorImpl("/" + SCHEME + "/olivedrab1");
        public static final Color OLIVEDRAB2  = new ColorImpl("/" + SCHEME + "/olivedrab2");
        public static final Color OLIVEDRAB3  = new ColorImpl("/" + SCHEME + "/olivedrab3");
        public static final Color OLIVEDRAB4  = new ColorImpl("/" + SCHEME + "/olivedrab4");
        public static final Color ORANGE = new ColorImpl("/" + SCHEME + "/orange");
        public static final Color ORANGE1  = new ColorImpl("/" + SCHEME + "/orange1");
        public static final Color ORANGE2  = new ColorImpl("/" + SCHEME + "/orange2");
        public static final Color ORANGE3  = new ColorImpl("/" + SCHEME + "/orange3");
        public static final Color ORANGE4  = new ColorImpl("/" + SCHEME + "/orange4");
        public static final Color ORANGERED = new ColorImpl("/" + SCHEME + "/orangered");
        public static final Color ORANGERED1  = new ColorImpl("/" + SCHEME + "/orangered1");
        public static final Color ORANGERED2  = new ColorImpl("/" + SCHEME + "/orangered2");
        public static final Color ORANGERED3  = new ColorImpl("/" + SCHEME + "/orangered3");
        public static final Color ORANGERED4  = new ColorImpl("/" + SCHEME + "/orangered4");
        public static final Color ORCHID = new ColorImpl("/" + SCHEME + "/orchid");
        public static final Color ORCHID1  = new ColorImpl("/" + SCHEME + "/orchid1");
        public static final Color ORCHID2  = new ColorImpl("/" + SCHEME + "/orchid2");
        public static final Color ORCHID3  = new ColorImpl("/" + SCHEME + "/orchid3");
        public static final Color ORCHID4  = new ColorImpl("/" + SCHEME + "/orchid4");
        public static final Color PALEGOLDENROD = new ColorImpl("/" + SCHEME + "/palegoldenrod");
        public static final Color PALEGREEN  = new ColorImpl("/" + SCHEME + "/palegreen");
        public static final Color PALEGREEN1  = new ColorImpl("/" + SCHEME + "/palegreen1");
        public static final Color PALEGREEN2  = new ColorImpl("/" + SCHEME + "/palegreen2");
        public static final Color PALEGREEN3  = new ColorImpl("/" + SCHEME + "/palegreen3");
        public static final Color PALEGREEN4 = new ColorImpl("/" + SCHEME + "/palegreen4");
        public static final Color PALETURQUOISE  = new ColorImpl("/" + SCHEME + "/paleturquoise");
        public static final Color PALETURQUOISE1  = new ColorImpl("/" + SCHEME + "/paleturquoise1");
        public static final Color PALETURQUOISE2  = new ColorImpl("/" + SCHEME + "/paleturquoise2");
        public static final Color PALETURQUOISE3  = new ColorImpl("/" + SCHEME + "/paleturquoise3");
        public static final Color PALETURQUOISE4 = new ColorImpl("/" + SCHEME + "/paleturquoise4");
        public static final Color PALEVIOLETRED  = new ColorImpl("/" + SCHEME + "/palevioletred");
        public static final Color PALEVIOLETRED1  = new ColorImpl("/" + SCHEME + "/palevioletred1");
        public static final Color PALEVIOLETRED2  = new ColorImpl("/" + SCHEME + "/palevioletred2");
        public static final Color PALEVIOLETRED3  = new ColorImpl("/" + SCHEME + "/palevioletred3");
        public static final Color PALEVIOLETRED4 = new ColorImpl("/" + SCHEME + "/palevioletred4");
        public static final Color PAPAYAWHIP  = new ColorImpl("/" + SCHEME + "/papayawhip");
        public static final Color PEACHPUFF  = new ColorImpl("/" + SCHEME + "/peachpuff");
        public static final Color PEACHPUFF1  = new ColorImpl("/" + SCHEME + "/peachpuff1");
        public static final Color PEACHPUFF2  = new ColorImpl("/" + SCHEME + "/peachpuff2");
        public static final Color PEACHPUFF3 = new ColorImpl("/" + SCHEME + "/peachpuff3");
        public static final Color PEACHPUFF4  = new ColorImpl("/" + SCHEME + "/peachpuff4");
        public static final Color PERU  = new ColorImpl("/" + SCHEME + "/peru");
        public static final Color PINK  = new ColorImpl("/" + SCHEME + "/pink");
        public static final Color PINK1  = new ColorImpl("/" + SCHEME + "/pink1");
        public static final Color PINK2 = new ColorImpl("/" + SCHEME + "/pink2");
        public static final Color PINK3  = new ColorImpl("/" + SCHEME + "/pink3");
        public static final Color PINK4  = new ColorImpl("/" + SCHEME + "/pink4");
        public static final Color PLUM  = new ColorImpl("/" + SCHEME + "/plum");
        public static final Color PLUM1  = new ColorImpl("/" + SCHEME + "/plum1");
        public static final Color PLUM2 = new ColorImpl("/" + SCHEME + "/plum2");
        public static final Color PLUM3  = new ColorImpl("/" + SCHEME + "/plum3");
        public static final Color PLUM4  = new ColorImpl("/" + SCHEME + "/plum4");
        public static final Color POWDERBLUE  = new ColorImpl("/" + SCHEME + "/powderblue");
        public static final Color PURPLE  = new ColorImpl("/" + SCHEME + "/purple");
        public static final Color PURPLE1 = new ColorImpl("/" + SCHEME + "/purple1");
        public static final Color PURPLE2  = new ColorImpl("/" + SCHEME + "/purple2");
        public static final Color PURPLE3  = new ColorImpl("/" + SCHEME + "/purple3");
        public static final Color PURPLE4  = new ColorImpl("/" + SCHEME + "/purple4");
        public static final Color REBECCAPURPLE  = new ColorImpl("/" + SCHEME + "/rebeccapurple");
        public static final Color RED = new ColorImpl("/" + SCHEME + "/red");
        public static final Color RED1  = new ColorImpl("/" + SCHEME + "/red1");
        public static final Color RED2  = new ColorImpl("/" + SCHEME + "/red2");
        public static final Color RED3  = new ColorImpl("/" + SCHEME + "/red3");
        public static final Color RED4  = new ColorImpl("/" + SCHEME + "/red4");
        public static final Color ROSYBROWN = new ColorImpl("/" + SCHEME + "/rosybrown");
        public static final Color ROSYBROWN1  = new ColorImpl("/" + SCHEME + "/rosybrown1");
        public static final Color ROSYBROWN2  = new ColorImpl("/" + SCHEME + "/rosybrown2");
        public static final Color ROSYBROWN3  = new ColorImpl("/" + SCHEME + "/rosybrown3");
        public static final Color ROSYBROWN4  = new ColorImpl("/" + SCHEME + "/rosybrown4");
        public static final Color ROYALBLUE = new ColorImpl("/" + SCHEME + "/royalblue");
        public static final Color ROYALBLUE1  = new ColorImpl("/" + SCHEME + "/royalblue1");
        public static final Color ROYALBLUE2  = new ColorImpl("/" + SCHEME + "/royalblue2");
        public static final Color ROYALBLUE3  = new ColorImpl("/" + SCHEME + "/royalblue3");
        public static final Color ROYALBLUE4  = new ColorImpl("/" + SCHEME + "/royalblue4");
        public static final Color SADDLEBROWN = new ColorImpl("/" + SCHEME + "/saddlebrown");
        public static final Color SALMON  = new ColorImpl("/" + SCHEME + "/salmon");
        public static final Color SALMON1  = new ColorImpl("/" + SCHEME + "/salmon1");
        public static final Color SALMON2  = new ColorImpl("/" + SCHEME + "/salmon2");
        public static final Color SALMON3  = new ColorImpl("/" + SCHEME + "/salmon3");
        public static final Color SALMON4 = new ColorImpl("/" + SCHEME + "/salmon4");
        public static final Color SANDYBROWN  = new ColorImpl("/" + SCHEME + "/sandybrown");
        public static final Color SEAGREEN  = new ColorImpl("/" + SCHEME + "/seagreen");
        public static final Color SEAGREEN1  = new ColorImpl("/" + SCHEME + "/seagreen1");
        public static final Color SEAGREEN2  = new ColorImpl("/" + SCHEME + "/seagreen2");
        public static final Color SEAGREEN3 = new ColorImpl("/" + SCHEME + "/seagreen3");
        public static final Color SEAGREEN4  = new ColorImpl("/" + SCHEME + "/seagreen4");
        public static final Color SEASHELL  = new ColorImpl("/" + SCHEME + "/seashell");
        public static final Color SEASHELL1  = new ColorImpl("/" + SCHEME + "/seashell1");
        public static final Color SEASHELL2  = new ColorImpl("/" + SCHEME + "/seashell2");
        public static final Color SEASHELL3 = new ColorImpl("/" + SCHEME + "/seashell3");
        public static final Color SEASHELL4  = new ColorImpl("/" + SCHEME + "/seashell4");
        public static final Color SIENNA  = new ColorImpl("/" + SCHEME + "/sienna");
        public static final Color SIENNA1  = new ColorImpl("/" + SCHEME + "/sienna1");
        public static final Color SIENNA2  = new ColorImpl("/" + SCHEME + "/sienna2");
        public static final Color SIENNA3 = new ColorImpl("/" + SCHEME + "/sienna3");
        public static final Color SIENNA4  = new ColorImpl("/" + SCHEME + "/sienna4");
        public static final Color SILVER  = new ColorImpl("/" + SCHEME + "/silver");
        public static final Color SKYBLUE  = new ColorImpl("/" + SCHEME + "/skyblue");
        public static final Color SKYBLUE1  = new ColorImpl("/" + SCHEME + "/skyblue1");
        public static final Color SKYBLUE2 = new ColorImpl("/" + SCHEME + "/skyblue2");
        public static final Color SKYBLUE3  = new ColorImpl("/" + SCHEME + "/skyblue3");
        public static final Color SKYBLUE4  = new ColorImpl("/" + SCHEME + "/skyblue4");
        public static final Color SLATEBLUE  = new ColorImpl("/" + SCHEME + "/slateblue");
        public static final Color SLATEBLUE1  = new ColorImpl("/" + SCHEME + "/slateblue1");
        public static final Color SLATEBLUE2 = new ColorImpl("/" + SCHEME + "/slateblue2");
        public static final Color SLATEBLUE3  = new ColorImpl("/" + SCHEME + "/slateblue3");
        public static final Color SLATEBLUE4  = new ColorImpl("/" + SCHEME + "/slateblue4");
        public static final Color SLATEGRAY  = new ColorImpl("/" + SCHEME + "/slategray");
        public static final Color SLATEGRAY1  = new ColorImpl("/" + SCHEME + "/slategray1");
        public static final Color SLATEGRAY2 = new ColorImpl("/" + SCHEME + "/slategray2");
        public static final Color SLATEGRAY3  = new ColorImpl("/" + SCHEME + "/slategray3");
        public static final Color SLATEGRAY4  = new ColorImpl("/" + SCHEME + "/slategray4");
        public static final Color SLATEGREY  = new ColorImpl("/" + SCHEME + "/slategrey");
        public static final Color SNOW  = new ColorImpl("/" + SCHEME + "/snow");
        public static final Color SNOW1 = new ColorImpl("/" + SCHEME + "/snow1");
        public static final Color SNOW2  = new ColorImpl("/" + SCHEME + "/snow2");
        public static final Color SNOW3  = new ColorImpl("/" + SCHEME + "/snow3");
        public static final Color SNOW4  = new ColorImpl("/" + SCHEME + "/snow4");
        public static final Color SPRINGGREEN  = new ColorImpl("/" + SCHEME + "/springgreen");
        public static final Color SPRINGGREEN1 = new ColorImpl("/" + SCHEME + "/springgreen1");
        public static final Color SPRINGGREEN2  = new ColorImpl("/" + SCHEME + "/springgreen2");
        public static final Color SPRINGGREEN3  = new ColorImpl("/" + SCHEME + "/springgreen3");
        public static final Color SPRINGGREEN4  = new ColorImpl("/" + SCHEME + "/springgreen4");
        public static final Color STEELBLUE  = new ColorImpl("/" + SCHEME + "/steelblue");
        public static final Color STEELBLUE1 = new ColorImpl("/" + SCHEME + "/steelblue1");
        public static final Color STEELBLUE2  = new ColorImpl("/" + SCHEME + "/steelblue2");
        public static final Color STEELBLUE3  = new ColorImpl("/" + SCHEME + "/steelblue3");
        public static final Color STEELBLUE4  = new ColorImpl("/" + SCHEME + "/steelblue4");
        public static final Color TAN  = new ColorImpl("/" + SCHEME + "/tan");
        public static final Color TAN1 = new ColorImpl("/" + SCHEME + "/tan1");
        public static final Color TAN2  = new ColorImpl("/" + SCHEME + "/tan2");
        public static final Color TAN3  = new ColorImpl("/" + SCHEME + "/tan3");
        public static final Color TAN4  = new ColorImpl("/" + SCHEME + "/tan4");
        public static final Color TEAL  = new ColorImpl("/" + SCHEME + "/teal");
        public static final Color THISTLE = new ColorImpl("/" + SCHEME + "/thistle");
        public static final Color THISTLE1  = new ColorImpl("/" + SCHEME + "/thistle1");
        public static final Color THISTLE2  = new ColorImpl("/" + SCHEME + "/thistle2");
        public static final Color THISTLE3  = new ColorImpl("/" + SCHEME + "/thistle3");
        public static final Color THISTLE4  = new ColorImpl("/" + SCHEME + "/thistle4");
        public static final Color TOMATO = new ColorImpl("/" + SCHEME + "/tomato");
        public static final Color TOMATO1  = new ColorImpl("/" + SCHEME + "/tomato1");
        public static final Color TOMATO2  = new ColorImpl("/" + SCHEME + "/tomato2");
        public static final Color TOMATO3  = new ColorImpl("/" + SCHEME + "/tomato3");
        public static final Color TOMATO4  = new ColorImpl("/" + SCHEME + "/tomato4");
        public static final Color TRANSPARENT = new ColorImpl("/" + SCHEME + "/transparent");
        public static final Color TURQUOISE  = new ColorImpl("/" + SCHEME + "/turquoise");
        public static final Color TURQUOISE1  = new ColorImpl("/" + SCHEME + "/turquoise1");
        public static final Color TURQUOISE2  = new ColorImpl("/" + SCHEME + "/turquoise2");
        public static final Color TURQUOISE3  = new ColorImpl("/" + SCHEME + "/turquoise3");
        public static final Color TURQUOISE4 = new ColorImpl("/" + SCHEME + "/turquoise4");
        public static final Color VIOLET  = new ColorImpl("/" + SCHEME + "/violet");
        public static final Color VIOLETRED  = new ColorImpl("/" + SCHEME + "/violetred");
        public static final Color VIOLETRED1  = new ColorImpl("/" + SCHEME + "/violetred1");
        public static final Color VIOLETRED2  = new ColorImpl("/" + SCHEME + "/violetred2");
        public static final Color VIOLETRED3 = new ColorImpl("/" + SCHEME + "/violetred3");
        public static final Color VIOLETRED4  = new ColorImpl("/" + SCHEME + "/violetred4");
        public static final Color WEBGRAY  = new ColorImpl("/" + SCHEME + "/webgray");
        public static final Color WEBGREEN  = new ColorImpl("/" + SCHEME + "/webgreen");
        public static final Color WEBGREY  = new ColorImpl("/" + SCHEME + "/webgrey");
        public static final Color WEBMAROON = new ColorImpl("/" + SCHEME + "/webmaroon");
        public static final Color WEBPURPLE  = new ColorImpl("/" + SCHEME + "/webpurple");
        public static final Color WHEAT  = new ColorImpl("/" + SCHEME + "/wheat");
        public static final Color WHEAT1  = new ColorImpl("/" + SCHEME + "/wheat1");
        public static final Color WHEAT2  = new ColorImpl("/" + SCHEME + "/wheat2");
        public static final Color WHEAT3 = new ColorImpl("/" + SCHEME + "/wheat3");
        public static final Color WHEAT4  = new ColorImpl("/" + SCHEME + "/wheat4");
        public static final Color WHITE  = new ColorImpl("/" + SCHEME + "/white");
        public static final Color WHITESMOKE  = new ColorImpl("/" + SCHEME + "/whitesmoke");
        public static final Color X11GRAY  = new ColorImpl("/" + SCHEME + "/x11gray");
        public static final Color X11GREEN = new ColorImpl("/" + SCHEME + "/x11green");
        public static final Color X11GREY  = new ColorImpl("/" + SCHEME + "/x11grey");
        public static final Color X11MAROON  = new ColorImpl("/" + SCHEME + "/x11maroon");
        public static final Color X11PURPLE  = new ColorImpl("/" + SCHEME + "/x11purple");
        public static final Color YELLOW  = new ColorImpl("/" + SCHEME + "/yellow");
        public static final Color YELLOW1 = new ColorImpl("/" + SCHEME + "/yellow1");
        public static final Color YELLOW2  = new ColorImpl("/" + SCHEME + "/yellow2");
        public static final Color YELLOW3  = new ColorImpl("/" + SCHEME + "/yellow3");
        public static final Color YELLOW4  = new ColorImpl("/" + SCHEME + "/yellow4");
        public static final Color YELLOWGREEN = new ColorImpl("/" + SCHEME + "/yellowgreen");
    }
}

/**
 * @author Carlos F. Heuberger, 2023-10-16
 *
 */
final class ColorImpl implements Color, Attribute {

    private final String value;
    
    ColorImpl(String value) {
        this.value = requireNonNull(value, "null value");
    }
    
    ColorImpl(int r, int g, int b) {
        value = String.format(Locale.ROOT, "#%02X%02X%02X", hex2(r), hex2(g), hex2(b));
    }
    
    ColorImpl(int a, int r, int g, int b) {
        value = String.format(Locale.ROOT, "#%02X%02X%02X%02X", hex2(r), hex2(g), hex2(b), hex2(a));
    }
    
    ColorImpl(double h, double s, double v) {
        value = String.format(Locale.ROOT, "%.3f %.3f %.3f", unit(h), unit(s), unit(v));
    }
    
    ColorImpl(double a, double h, double s, double v) {
        value = String.format(Locale.ROOT, "%.3f %.3f %.3f %.3f", unit(h), unit(s), unit(v), unit(a));
    }
    
    @Override
    public Attr.GS bgcolor() {
        return Dot.bgcolor(this);
    }
    
    @Override
    public Attr.SNE color() {
        return Dot.color(this);
    }
    
    @Override
    public Attr.SNE fill() {
        return Dot.fillcolor(this);
    }
    
    @Override
    public Attr.GSNE font() {
        return Dot.fontcolor(this);
    }

    @Override
    public ColorList to(Color second) {
        return new ColorListImpl(this, (ColorImpl) second);
    }
    
    @Override
    public ColorList split(Color second, double fraction) {
        return new ColorListImpl(this, (ColorImpl) second, fraction);
    }

    @Override
    public ColorList split(double fraction, Color second) {
        return new ColorListImpl(this, fraction, (ColorImpl) second);
    }
    
    @Override
    public String script() {
        return "color=" + quote(value);
    }
    
    @Override
    public String toString() {
        return quote(value);
    }
    
    String value() {
        return value;
    }
    
    private static int hex2(int value) {
        if (value < 0x00 || value > 0xFF)
            throw new IllegalArgumentException("invalid value, expected hexadecimal between 0x00 and 0xFF: " + Integer.toHexString(value));
        return value;
    }
    
    private static double unit(double value) {
        if (value < 0 || value > 1.0)
            throw new IllegalArgumentException("invalid value, expected double between 0.0 and 1,0: " + value);
        return value;
    }
}