package com.kiranastore.KiranaStoreService.service.impl;

import com.kiranastore.KiranaStoreService.model.KiranaStore;
import com.kiranastore.KiranaStoreService.repository.KiranaStoreRepository;
import com.kiranastore.KiranaStoreService.service.KiranaStoreService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
@Service
public class KiranaStoreServiceImpl implements KiranaStoreService {
    KiranaStoreRepository kiranaStoreRepository;

    public KiranaStoreServiceImpl(KiranaStoreRepository kiranaStoreRepository) {
        this.kiranaStoreRepository = kiranaStoreRepository;
    }

    @Override
    public String createItem(KiranaStore kiranaStore) {
        // 1 USD = 83.2796053507 INR
//        if(kiranaStore.getAmountType().equals("USD")){
//            kiranaStore.setAmount(kiranaStore.getAmount()*83.2796053507);
//            kiranaStore.setAmountType("INR");
//        }
        if(kiranaStoreRepository.existsById(Integer.toString(kiranaStore.getId())))
            return "Transaction ID already exist";
        kiranaStore.setDate(LocalDate.now());
        kiranaStoreRepository.save(kiranaStore);
        return "Success";
    }

    @Override
    public String updateItem(KiranaStore kiranaStore) {
        kiranaStoreRepository.save(kiranaStore);
        return "Success";
    }

    @Override
    public String deleteItem(int id) {
        // More Business Logic
        kiranaStoreRepository.deleteById(Integer.toString(id));
        return "Success";
    }

    @Override
    public List<KiranaStore> getTransactionsByDate(LocalDate date) {
        List<KiranaStore>allitems= getAllItems();
        System.out.println(allitems.size());
        List<KiranaStore>res=new ArrayList<>();
        for(int i=0;i<allitems.size();i++)
        {
            System.out.println(allitems.get(i).getDate()+" "+ date);
            if(allitems.get(i).getDate().equals(date)){
                res.add(allitems.get(i));
            }
        }
        return res;
    }

    @Override
    public KiranaStore getSingleItem(int id) {
        return kiranaStoreRepository.findById(Integer.toString(id)).get();
    }

    @Override
    public List<KiranaStore> getAllItems() {
        return kiranaStoreRepository.findAll();
    }
}
