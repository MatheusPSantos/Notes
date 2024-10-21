import com.br.padroesdeprojetos.command.GarageDoor;
import com.br.padroesdeprojetos.command.GarageDoorOpenCommand;
import com.br.padroesdeprojetos.command.Light;
import com.br.padroesdeprojetos.command.LightOnCommand;
import com.br.padroesdeprojetos.command.SimpleRemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light ligth = new Light();
        GarageDoor door = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(ligth);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(door);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(garageOpen);
        simpleRemoteControl.buttonWasPressed();
    }
}
