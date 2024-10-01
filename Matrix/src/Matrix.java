import java.io.IOException;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class Matrix {

    public static void main(String[] args) throws IOException, InterruptedException {

        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);

        int breite = terminal.getTerminalSize().getColumns();//Anzahl Spalten(üblicherweise 80)

        int höhe = terminal.getTerminalSize().getRows();//Anzahl Zeilen(üblicherweise 24)

        int[] kopf = new int[breite];//Positionen der Tropfen
        int[] lange = new int[breite];//Lange jeder Regenspur

        //Regeneffekt initialisieren
        for (int x = 0; x < breite; x++) {
            kopf[x] = (int)(Math.random()*höhe);

        }

        //Bildschirm initialisieren
        screen.startScreen();
        screen.clear();

        while (screen.pollInput() == null) {

            for (int x = 0; x < breite; x++) {
                if (Math.random() < 0.2){
                    lange[x] = (int)(Math.random()*15 + 3);
                }
            }


            //solange keine Taste gedruckt wird
            for (int x = 0; x < breite; x++) {
                //für jede Spalte

                int tailPos = (kopf[x] - lange[x] + höhe) % höhe;
                terminal.setCursorPosition(x,tailPos);
                terminal.putCharacter(' ');

                kopf[x] = (kopf[x] + 1) % höhe;

                for (int y = 0; y < lange[x]; y++) {
                    int posY = (kopf[x] - y + höhe) % höhe;

                    terminal.setCursorPosition(x,posY);//Cursor an Bildschirmposition(x,y)bewegen
                    terminal.setForegroundColor(TextColor.ANSI.GREEN);
                    terminal.putCharacter('#');
                }

            }
            terminal.flush();//Bildschirminhalt aktualisieren
            java.util.concurrent.TimeUnit.MILLISECONDS.sleep(1000);//je nach Rechnergeschwindigkeit ggf. kurz warten
        }
        //Bildschirm anhalten und schliessen
        screen.stopScreen();
        screen.close();
    }


}
