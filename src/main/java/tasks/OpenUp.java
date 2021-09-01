package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userInterface.UtestPage;

public class OpenUp implements Task {

    private UtestPage uTestPage;
    public static Performable theUtestPage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(actor);
        actor.attemptsTo(Open.browserOn(uTestPage));
    }
}
