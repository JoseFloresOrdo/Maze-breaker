import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jugador1 jugador1 = new Jugador1();
        addObject(jugador1,49,233);
        Jugador2 jugador2 = new Jugador2();
        addObject(jugador2,442,225);
        Proyectil proyectil = new Proyectil();
        addObject(proyectil,116,231);
        proyectil.setLocation(168,234);
        jugador2.setLocation(633,354);
        jugador1.setLocation(15,385);
        jugador2.setLocation(666,385);
        NubeHorizontal nubeHorizontal = new NubeHorizontal();
        addObject(nubeHorizontal,521,216);
        NubeVertical nubeVertical = new NubeVertical();
        addObject(nubeVertical,477,353);
        nubeVertical.setLocation(139,406);
        nubeHorizontal.setLocation(523,388);
        proyectil.setLocation(317,243);
        removeObject(proyectil);
        nubeVertical.setLocation(125,410);
        nubeVertical.setLocation(326,536);
        nubeHorizontal.setLocation(41,449);
        NubeHorizontal nubeHorizontal2 = new NubeHorizontal();
        addObject(nubeHorizontal2,121,230);
        nubeHorizontal2.setLocation(57,324);
        NubeHorizontal nubeHorizontal3 = new NubeHorizontal();
        addObject(nubeHorizontal3,608,294);
        nubeHorizontal3.setLocation(649,315);
        NubeHorizontal nubeHorizontal4 = new NubeHorizontal();
        addObject(nubeHorizontal4,514,432);
        nubeHorizontal4.setLocation(660,449);
        jugador2.setLocation(670,380);
        nubeHorizontal4.setLocation(646,416);
        nubeVertical.setLocation(130,281);
        NubeVertical nubeVertical2 = new NubeVertical();
        addObject(nubeVertical2,347,356);
        nubeVertical2.setLocation(488,436);
        NubeVertical nubeVertical3 = new NubeVertical();
        addObject(nubeVertical3,476,272);
        nubeVertical3.setLocation(491,332);
        nubeVertical3.setLocation(497,345);
        nubeVertical3.setLocation(495,344);
        nubeVertical2.setLocation(487,414);
        nubeVertical3.setLocation(485,340);
        nubeVertical3.setLocation(287,346);
        nubeVertical2.setLocation(289,411);
        NubeVertical nubeVertical4 = new NubeVertical();
        addObject(nubeVertical4,473,379);
        nubeVertical4.setLocation(492,338);
        NubeVertical nubeVertical5 = new NubeVertical();
        addObject(nubeVertical5,490,461);
        nubeVertical5.setLocation(492,438);
        NubeHorizontal nubeHorizontal5 = new NubeHorizontal();
        addObject(nubeHorizontal5,401,384);
        nubeHorizontal5.setLocation(386,385);
        nubeHorizontal5.setLocation(379,389);
        nubeVertical3.setLocation(241,344);
        nubeVertical2.setLocation(229,416);
        nubeVertical4.setLocation(533,341);
        nubeVertical5.setLocation(546,422);
        nubeVertical4.setLocation(528,329);
        nubeVertical5.setLocation(511,415);
        nubeVertical4.setLocation(513,346);
        nubeVertical5.setLocation(513,418);
        jugador2.setLocation(668,367);
        nubeHorizontal5.setLocation(374,374);
        jugador1.setLocation(35,389);
        nubeHorizontal4.setLocation(642,433);
        nubeHorizontal2.setLocation(36,322);
        nubeVertical.setLocation(124,300);
        nubeVertical2.setLocation(233,456);
        nubeVertical3.setLocation(246,362);
        nubeVertical2.setLocation(255,422);
        nubeVertical2.setLocation(242,433);
        nubeVertical3.setLocation(237,338);
        nubeVertical3.setLocation(226,336);
        nubeVertical3.setLocation(242,363);
        nubeHorizontal4.setLocation(657,528);
        jugador2.setLocation(673,393);
        nubeHorizontal4.setLocation(656,452);
        nubeHorizontal2.setLocation(50,320);
        nubeVertical3.setLocation(238,336);
        nubeVertical2.setLocation(243,423);
        nubeVertical2.setLocation(237,436);
        nubeVertical2.setLocation(236,439);
        nubeVertical2.setLocation(244,434);
        nubeVertical2.setLocation(237,450);
        nubeVertical2.setLocation(239,408);
        nubeVertical2.setLocation(238,424);
        nubeVertical.setLocation(131,308);
        nubeVertical.setLocation(140,323);
        nubeVertical.setLocation(144,322);
        nubeVertical.setLocation(140,321);
        nubeVertical.setLocation(140,292);
        nubeVertical.setLocation(116,303);
        nubeVertical.setLocation(129,313);
        nubeVertical.setLocation(136,299);
        nubeVertical.setLocation(124,320);
        nubeVertical.setLocation(140,324);
        nubeVertical.setLocation(142,298);
        nubeVertical.setLocation(420,548);
        nubeVertical.setLocation(235,663);
        NubeVertical nubeVertical6 = new NubeVertical();
        addObject(nubeVertical6,410,539);
        nubeVertical6.setLocation(249,589);
        nubeVertical.setLocation(236,671);
        NubeVertical nubeVertical7 = new NubeVertical();
        addObject(nubeVertical7,483,581);
        nubeVertical7.setLocation(501,660);
        NubeVertical nubeVertical8 = new NubeVertical();
        addObject(nubeVertical8,409,583);
        nubeVertical8.setLocation(498,595);
        nubeVertical8.setLocation(480,586);
        nubeVertical8.setLocation(482,584);
        nubeVertical6.setLocation(238,596);
        nubeVertical8.setLocation(490,578);
        nubeVertical6.setLocation(241,601);
        nubeVertical6.setLocation(233,610);
        nubeVertical6.setLocation(235,602);
        nubeVertical6.setLocation(234,601);
        nubeVertical6.setLocation(227,585);
        nubeVertical6.setLocation(231,574);
        nubeVertical6.setLocation(246,582);
        nubeVertical6.setLocation(231,580);
        nubeVertical6.setLocation(224,599);
        nubeVertical6.setLocation(223,601);
        nubeVertical6.setLocation(241,600);
        nubeVertical6.setLocation(234,602);
        nubeVertical6.setLocation(239,603);
        nubeVertical6.setLocation(237,604);
        nubeVertical6.setLocation(238,602);
        nubeVertical6.setLocation(239,586);
        nubeVertical6.setLocation(235,588);
        nubeVertical6.setLocation(235,608);
        nubeVertical6.setLocation(236,608);
        nubeVertical8.setLocation(504,588);
        nubeVertical8.setLocation(497,604);
        nubeVertical8.setLocation(495,574);
        nubeVertical8.setLocation(505,592);
        nubeVertical8.setLocation(492,592);
        nubeVertical8.setLocation(481,596);
        nubeVertical8.setLocation(503,633);
        nubeVertical8.setLocation(499,586);
        nubeVertical8.setLocation(490,600);
        nubeVertical8.setLocation(483,612);
        nubeVertical8.setLocation(499,593);
        nubeVertical8.setLocation(485,607);
        nubeVertical8.setLocation(483,591);
        nubeVertical8.setLocation(502,615);
        nubeVertical8.setLocation(504,596);
        nubeVertical8.setLocation(503,565);
        nubeVertical8.setLocation(504,572);
        nubeVertical8.setLocation(496,610);
        nubeVertical8.setLocation(488,589);
        nubeVertical8.setLocation(486,600);
        nubeVertical8.setLocation(499,593);
        nubeVertical8.setLocation(490,587);
        nubeVertical8.setLocation(507,595);
        nubeVertical8.setLocation(509,587);
        nubeVertical8.setLocation(487,580);
        nubeVertical8.setLocation(492,592);
        nubeVertical8.setLocation(508,585);
        nubeVertical8.setLocation(490,582);
        nubeVertical8.setLocation(496,596);
        nubeVertical8.setLocation(507,590);
        nubeVertical8.setLocation(497,609);
        nubeVertical8.setLocation(494,596);
        nubeVertical8.setLocation(503,599);
        nubeVertical8.setLocation(505,604);
        nubeVertical7.setLocation(498,686);
        nubeVertical7.setLocation(497,680);
        nubeVertical7.setLocation(506,703);
        nubeVertical7.setLocation(514,701);
        nubeVertical8.setLocation(506,600);
        nubeVertical7.setLocation(516,682);
        nubeVertical8.setLocation(518,584);
        nubeVertical8.setLocation(514,597);
        nubeVertical8.setLocation(513,608);
        nubeVertical8.setLocation(513,589);
        nubeVertical8.setLocation(511,590);
        nubeVertical8.setLocation(523,593);
        nubeVertical8.setLocation(528,579);
        nubeVertical8.setLocation(524,615);
        nubeVertical8.setLocation(520,608);
        nubeVertical8.setLocation(520,609);
        nubeVertical8.setLocation(514,593);
        nubeVertical8.setLocation(521,588);
        nubeVertical8.setLocation(531,597);
        nubeVertical8.setLocation(506,595);
        nubeVertical8.setLocation(521,608);
        nubeVertical8.setLocation(515,607);
        nubeVertical8.setLocation(516,607);
        NubeVertical nubeVertical9 = new NubeVertical();
        addObject(nubeVertical9,467,182);
        nubeVertical9.setLocation(520,51);
        nubeVertical9.setLocation(511,57);
        NubeVertical nubeVertical10 = new NubeVertical();
        addObject(nubeVertical10,223,119);
        nubeVertical10.setLocation(241,48);
        nubeVertical9.setLocation(505,40);
        NubeVertical nubeVertical11 = new NubeVertical();
        addObject(nubeVertical11,359,187);
        nubeVertical11.setLocation(241,154);
        NubeVertical nubeVertical12 = new NubeVertical();
        addObject(nubeVertical12,379,153);
        nubeVertical12.setLocation(505,137);
        nubeVertical11.setLocation(243,121);
        nubeVertical11.setLocation(247,139);
        nubeVertical11.setLocation(245,162);
        nubeVertical11.setLocation(235,160);
        nubeVertical11.setLocation(241,164);
        nubeVertical11.setLocation(249,160);
        nubeVertical11.setLocation(244,148);
        nubeVertical11.setLocation(251,164);
        nubeVertical11.setLocation(249,144);
        nubeVertical11.setLocation(248,155);
        nubeVertical11.setLocation(247,157);
        nubeVertical11.setLocation(248,157);
        nubeVertical11.setLocation(238,148);
        nubeVertical11.setLocation(242,146);
        nubeVertical11.setLocation(255,156);
        nubeVertical11.setLocation(248,143);
        nubeVertical11.setLocation(238,147);
        nubeVertical11.setLocation(233,138);
        nubeVertical11.setLocation(251,144);
        nubeVertical11.setLocation(249,130);
        nubeVertical11.setLocation(241,153);
        nubeVertical11.setLocation(238,151);
        nubeVertical11.setLocation(241,152);
        nubeVertical11.setLocation(243,135);
        nubeVertical11.setLocation(248,132);
        nubeVertical11.setLocation(239,131);
        nubeVertical11.setLocation(255,149);
        nubeVertical11.setLocation(228,143);
        nubeVertical11.setLocation(240,137);
        nubeVertical11.setLocation(249,168);
        nubeVertical11.setLocation(244,135);
        nubeVertical11.setLocation(251,168);
        nubeVertical11.setLocation(253,152);
        nubeVertical11.setLocation(247,157);
        nubeVertical11.setLocation(249,157);
        nubeVertical11.setLocation(255,156);
        nubeVertical11.setLocation(245,154);
        nubeVertical11.setLocation(242,169);
        nubeVertical11.setLocation(261,136);
        nubeVertical11.setLocation(235,132);
        nubeVertical11.setLocation(249,156);
        nubeVertical11.setLocation(249,132);
        nubeVertical11.setLocation(247,137);
        nubeVertical11.setLocation(252,154);
        nubeVertical11.setLocation(243,139);
        nubeVertical11.setLocation(244,173);
        nubeVertical11.setLocation(245,128);
        nubeVertical11.setLocation(247,130);
        nubeVertical11.setLocation(243,149);
        nubeVertical11.setLocation(247,164);
        nubeVertical11.setLocation(250,164);
        nubeVertical11.setLocation(255,180);
        nubeVertical11.setLocation(246,148);
        nubeVertical11.setLocation(244,133);
        nubeVertical11.setLocation(248,142);
        nubeVertical11.setLocation(251,154);
        nubeVertical11.setLocation(255,146);
        nubeVertical11.setLocation(235,134);
        nubeVertical11.setLocation(253,156);
        nubeVertical11.setLocation(245,133);
        nubeVertical11.setLocation(245,151);
        nubeVertical11.setLocation(238,124);
        nubeVertical11.setLocation(247,141);
        nubeVertical11.setLocation(250,152);
        nubeVertical11.setLocation(233,136);
        nubeVertical11.setLocation(239,153);
        nubeVertical11.setLocation(244,156);
        nubeVertical11.setLocation(254,169);
        nubeVertical11.setLocation(244,131);
        nubeVertical10.setLocation(243,45);
        nubeVertical10.setLocation(244,48);
        NubeHorizontal nubeHorizontal6 = new NubeHorizontal();
        addObject(nubeHorizontal6,376,150);
        nubeHorizontal6.setLocation(371,227);
        NubeHorizontal nubeHorizontal7 = new NubeHorizontal();
        addObject(nubeHorizontal7,366,110);
        nubeHorizontal7.setLocation(375,87);
        NubeHorizontal nubeHorizontal8 = new NubeHorizontal();
        addObject(nubeHorizontal8,371,520);
        nubeHorizontal8.setLocation(378,519);
        NubeHorizontal nubeHorizontal9 = new NubeHorizontal();
        addObject(nubeHorizontal9,375,661);
        nubeHorizontal9.setLocation(377,619);
        NubeVertical nubeVertical13 = new NubeVertical();
        addObject(nubeVertical13,123,216);
        nubeVertical13.setLocation(131,176);
        NubeVertical nubeVertical14 = new NubeVertical();
        addObject(nubeVertical14,592,200);
        nubeVertical14.setLocation(611,168);
        nubeVertical14.setLocation(620,170);
        NubeVertical nubeVertical15 = new NubeVertical();
        addObject(nubeVertical15,60,617);
        nubeVertical15.setLocation(153,564);
        NubeVertical nubeVertical16 = new NubeVertical();
        addObject(nubeVertical16,661,590);
        nubeVertical16.setLocation(596,576);
        nubeVertical16.setLocation(613,570);
        nubeVertical15.setLocation(138,575);
        jugador2.setLocation(648,372);
        nubeHorizontal9.setLocation(389,641);
        nubeHorizontal9.setLocation(364,638);
        nubeHorizontal9.setLocation(379,641);
    }
}