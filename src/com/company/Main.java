package com.company;

public class Main {

    public static void main(String[] args) {
        League bwin = new League();

        Club slb = new Club("SL Benfica", 1904, new President("Rui Costa", 49, 100000, 2));//preferi fazer com o clube "ilegal" just for fun ehehehe
        Club fcp = new Club("FC Porto", 1893, new President("Pinto da Costa", 83, 100000, 5));
        Club scp = new Club("Sporting CP", 1906, new President("Frederico Varandas", 43, 100000, 2));
        Club scb = new Club("SC Braga", 1921, new President("António Salvador", 50, 50000, 3));
        Club vsc = new Club("Vitória SC", 1922, new President("Miguel Pinto Lisboa", 49, 50000, 3));
        Club bfc = new Club("Boavista FC", 1903, new President("João Loureiro", 58, 25000, 4));
        Club gdep = new Club("GD Estoril", 1939, new President("Alexandre Faria", 48, 12000, 1));
        Club gvfc = new Club("Gil Vicente FC", 1924, new President("Francisco Dias da Silva", 72, 12000, 2));
        Club fcpf = new Club("FC Paços de Ferreria", 1950, new President("Paulo Meneses", 43, 10000, 0));
        Club cdt = new Club("CD Tondela", 1933, new President("Gilberto Neves Coimbra", 59, 10000, 1));
        Club csm = new Club("CS Marítimo", 1919, new President("Carlos Pereira", 69, 10000, 3));
        Club mfc = new Club("Moreirense FC", 1938, new President("Vítor Magalhães", 70, 10000, 2));
        Club cdsc = new Club("CD Santa Clara", 1927, new President("Rui Melo Cordeiro", 38, 12000, 0));
        Club fcf = new Club("FC Famalicão", 1931, new President("Jorge Silva", 56, 7500, 2));
        Club fcv = new Club("FC Vizela", 1939, new President("Eduardo Guimarães", 55, 5000, 0));
        Club bsad = new Club("B-SAD", 2018, new President("Rui Pedro Soares", 49, 10000, 3));
        Club fca = new Club("FC Arouca", 1952, new President("Carlos Pinho", 62, 10000, 1));
        Club psc = new Club("Portimonense SC", 1914, new President("Fernando Rocha", 66, 10000, 4));


        bwin.registerClub(slb);
        bwin.registerClub(fcp);
        bwin.registerClub(scp);
        bwin.registerClub(scb);
        bwin.registerClub(vsc);
        bwin.registerClub(bfc);
        bwin.registerClub(gdep);
        bwin.registerClub(gvfc);
        bwin.registerClub(fcpf);
        bwin.registerClub(cdt);
        bwin.registerClub(csm);
        bwin.registerClub(mfc);
        bwin.registerClub(cdsc);
        bwin.registerClub(fcf);
        bwin.registerClub(fcv);
        bwin.registerClub(bsad);
        bwin.registerClub(fca);
        bwin.registerClub(psc);


        Staff jj = new Coach("Jorge Jesus", 67, 500000, "Main coach");
        Staff jd = new Coach("João de Deus", 44, 125000, "Assistant Coach");

        slb.hireCoach((Coach) jj);
        slb.hireCoach((Coach) jd);

        Player vlachodimos = new Player("Vlachodimos", 27, "GK", 99, 100000);
        Player lucas = new Player("Lucas Veríssimo", 26, "CB", 4, 80000);
        Player jm = new Player("João Mário", 28, "CM", 20, 120000);
        Player gonRamos = new Player("Gonçalo Ramos", 20, "ST", 88, 50000);
        Player pizzi = new Player("Pizzi", 31, "CM", 21, 150000);

        slb.signPlayer(vlachodimos);
        slb.signPlayer(lucas);
        slb.signPlayer(jm);
        slb.signPlayer(gonRamos);
        slb.signPlayer(pizzi);

        Kit first = new Kit("adidas", "red");
        Kit second = new Kit("nike", "white");
        Kit third = new Kit("puma", "black");

        slb.newKit(first);
        slb.newKit(second);
        slb.newKit(third);

        Player luisDiaz = new Player("Luis Díaz", 24, "LW", 7, 150000);
        fcp.signPlayer(luisDiaz);
    }
}
