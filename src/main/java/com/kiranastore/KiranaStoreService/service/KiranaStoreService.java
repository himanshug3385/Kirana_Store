package com.kiranastore.KiranaStoreService.service;

import com.kiranastore.KiranaStoreService.model.KiranaStore;

import java.time.LocalDate;
import java.util.List;

public interface KiranaStoreService {
    public String createItem(KiranaStore kiranaStore);
    public String updateItem(KiranaStore kiranaStore);
    public String deleteItem(int id);
    List<KiranaStore> getTransactionsByDate(LocalDate date);
    public KiranaStore getSingleItem(int id);
    public List<KiranaStore> getAllItems();
}
