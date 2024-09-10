package com.example.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public List<Item> getItemByPage() {
        // 내가 가지고 올 페이지 정보를 담은 객체를 하나 생성
        
        List<Item> page = itemRepository.findAll();
        
        if (page.isEmpty()) {
            return null;
        }
        return page;
    }
}
