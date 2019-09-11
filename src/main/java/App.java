import static spark.Spark.*;

import spark.ModelAndView;

import java.util.HashMap;

public class App {

    private static Pairer pairs;

    public static void main(String[] args) {
        get("/", (request, response) -> {
            return new ModelAndView(new HashMap(), "templates/index.vtl");
        }, new spark.template.velocity.VelocityTemplateEngine());

        post("/two-three-pair", (request, response) -> {
            pairs = new Pairer();
            pairs.setPairs(Pairer.twoThreePair());
            response.redirect("/pairs");
            return null;
        });

        post("/crunch-pair", (request, response) -> {
            pairs = new Pairer();
            pairs.setPairs(Pairer.crunchPair());
            response.redirect("/pairs");
            return null;
        });

        get("/pairs", (request, response) -> {
            HashMap model = new HashMap();
            model.put("pairs", pairs.getPairs());
            return new ModelAndView(model, "templates/pairs.vtl");
        }, new spark.template.velocity.VelocityTemplateEngine());
    }
}
