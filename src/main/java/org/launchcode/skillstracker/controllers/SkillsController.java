package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String languages() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("/form")
    @ResponseBody
    public String languagesForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form/results'>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Enter your name: </h2>" +
                        "<input type = 'text' name = 'firstName' />" +
                        "<h3>Choose your favorite language: </h3>" +
                        "<select name = 'first' id='languages'>" +
                        "<option>Java</option>" +
                        "<option>JavaScript</option>" +
                        "<option>Python</option>" +
                        "</select>" +
                        "<h3>Choose your second favorite language: </h3>" +
                        "<select name = 'second' id='languages'>" +
                        "<option>Java</option>" +
                        "<option>JavaScript</option>" +
                        "<option>Python</option>" +
                        "</select>" +
                        "<h3>Choose your third favorite language: </h3>" +
                        "<select name = 'third' id='languages'>" +
                        "<option>Java</option>" +
                        "<option>JavaScript</option>" +
                        "<option>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<br>" +
                        "<input type = 'submit' value = 'Submit'>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

//    @RequestMapping(value = "form", method = {RequestMethod.GET, RequestMethod.POST})
    @PostMapping("/form/results")
    @ResponseBody
    public String languagePreferences(@RequestParam String firstName, @RequestParam String first, @RequestParam String second, @RequestParam String third) {

        String html =
                "<html>" +
                        "<form method='post' action='/form/results'>" +
                        "<body>" +
                        "<h1>" + firstName + "</h1>" +
                        "<table>" +
                        "<tr><th>Choices</th></tr>" +
                        "<tr>" +
                        "<td>" + first + "</td>" +
                        "</tr>" +
                        "<tr>" +
                        "<td>" + second + "</td>" +
                        "</tr>" +
                        "<tr>" +
                        "<td>" + third + "</td>" +
                        "</tr>" +
                        "</table>" +
                        "</body>" +
                        "</html>";

        return html;

    }

}




