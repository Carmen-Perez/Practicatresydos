package main.java.Practicatresdos;
public class Main {

    public static void main(String[] args){

        main.java.Practicatresdos.Microorganismo microorganismos[] = new main.java.Practicatresdos.Microorganismo[4];
        main.java.Practicatresdos.Organo organos[] = new main.java.Practicatresdos.Organo[7];

        microorganismos[0] = new main.java.Practicatresdos.Microorganismo(256, "m1",0);
        microorganismos[1] = new main.java.Practicatresdos.Microorganismo(256, "m2",0);
        microorganismos[2] = new main.java.Practicatresdos.Microorganismo(256, "m3",0);
        microorganismos[3] = new main.java.Practicatresdos.Microorganismo(256, "m4",0);

        organos[0] = new main.java.Practicatresdos.Organo("cerebro");
        organos[1] = new main.java.Practicatresdos.Organo("corazon");
        organos[2] = new main.java.Practicatresdos.Organo("estomago");
        organos[3] = new main.java.Practicatresdos.Organo("boca");
        organos[4] = new main.java.Practicatresdos.Organo("intestinos");
        organos[5] = new main.java.Practicatresdos.Organo("higado");
        organos[6] = new main.java.Practicatresdos.Organo("pulmones");

        int i;
        do {
            for (i = 0; i < 4; i++) {
                if (microorganismos[i].vida != 0) {
                    switch (microorganismos[i].posicion) {
                        case 0:
                            System.out.println("El " + microorganismos[i].GetNombre() + "esta en " + organos[0].GetNombreb() + "su vida ahora es:" + microorganismos[i].GetVida());
                            break;
                        case 1:
                            System.out.println("El " + microorganismos[i].GetNombre() + "esta en " + organos[1].GetNombreb() + "su vida ahora es:" + microorganismos[i].GetVida());
                            break;
                        case 2:
                            System.out.println("El " + microorganismos[i].GetNombre() + "esta en " + organos[2].GetNombreb() + "su vida ahora es:" + microorganismos[i].GetVida());
                            break;
                        case 4:
                            microorganismos[i].vida = (microorganismos[i].GetVida() / 2);
                            System.out.println("El " + microorganismos[i].GetNombre() + "esta en " + organos[3].GetNombreb() + "su vida ahora es:" + microorganismos[i].GetVida());
                            break;
                        case 5:
                            System.out.println("El " + microorganismos[i].GetNombre() + "esta en " + organos[4].GetNombreb() + "su vida ahora es:" + microorganismos[i].GetVida());
                            break;
                        case 6:
                            System.out.println("El " + microorganismos[i].GetNombre() + "esta en " + organos[5].GetNombreb() + "su vida ahora es:" + microorganismos[i].GetVida());
                            break;
                        case 7:
                            System.out.println("El " + microorganismos[i].GetNombre() + "esta en " + organos[6].GetNombreb() + "su vida ahora es:" + microorganismos[i].GetVida());
                            break;
                    }
                }
                else{
                    System.out.println("El "+ microorganismos[i].GetNombre() + " esta en " + organos[microorganismos[i].posicion].GetNombreb() + "su vida ahora es: " + microorganismos[i].GetVida());
                }
            }
            System.out.println("\n");
        }while (microorganismos[1].vida!=0||microorganismos[2].vida!=0||microorganismos[3].vida!=0||microorganismos[4].vida!=0);
    }
}
