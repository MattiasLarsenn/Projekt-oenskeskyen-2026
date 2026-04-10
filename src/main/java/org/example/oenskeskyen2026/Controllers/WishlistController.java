package org.example.oenskeskyen2026.Controllers;


import org.example.oenskeskyen2026.Service.WishlistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class WishlistController
{

    private final WishlistService wishlistService;

    public WishlistController(WishlistService service)
    {
        this.wishlistService = service;
    }

    @GetMapping("/")
    public String forside()
    {
        return "Det her er forsiden";
    }

    @GetMapping("/hejsa")
    public List<String> hejsa()
    {
        return wishlistService.getWishlist();
    }
}
