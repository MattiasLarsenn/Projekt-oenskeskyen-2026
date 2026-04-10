package org.example.oenskeskyen2026.Service;

import org.example.oenskeskyen2026.Repositories.WishlistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService
{
    private final WishlistRepository wishlistRepository;

    public WishlistService(WishlistRepository wishlistRepository)
    {
        this.wishlistRepository = wishlistRepository;
    }

    public List<String> getWishlist()
    {
        return wishlistRepository.getWishlist();
    }
}
