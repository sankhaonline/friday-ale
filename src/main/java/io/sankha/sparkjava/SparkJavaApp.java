package io.sankha.sparkjava;

import spark.ModelAndView;
import spark.Spark;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 16-07-2017.
 */
public class SparkJavaApp {
    public static void main( String[] args ){
        Spark.get("/spj", (req, res) -> "Hello Spark Java");

        Map map = new HashMap();
        map.put("group", "Fleetwood Mac");
        Spark.get("/thyme", (rq, rs) -> new ModelAndView(map, "template"), new ThymeleafTemplateEngine());

    }
}
