package org.example.oenskeskyen2026.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OenskeController
{
    @GetMapping("/")
    public String forside()
    {
        return "Det her er forsiden";
    }

    @GetMapping("/Hey")
    public String hey()
    {
        return "Hey";
    }
}
