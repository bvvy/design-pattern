package command.first;

/**
 * Created by bvvy on 2017/7/20.
 */
public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void executed() {
        light.on();
    }
}
