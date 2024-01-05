package com.kiranastore.KiranaStoreService.controller;

import com.kiranastore.KiranaStoreService.model.KiranaStore;
import com.kiranastore.KiranaStoreService.service.KiranaStoreService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/kiranstore")
public class KiranaStoreApiController {

    KiranaStoreService kiranaStoreService;

    public KiranaStoreApiController(KiranaStoreService kiranaStoreService) {
        this.kiranaStoreService = kiranaStoreService;
    }

    @GetMapping("{id}")
    public KiranaStore getSingleTransaction(@PathVariable("id") int id){
     return kiranaStoreService.getSingleItem(id);
 }
 @GetMapping()
    public List<KiranaStore> getAllTransactions(){
     return kiranaStoreService.getAllItems();
 }

    @GetMapping("/byDate")
    public ResponseEntity<List<KiranaStore>> getTransactionsByDate(@RequestParam("date") String dateString) {
        LocalDate date = LocalDate.parse(dateString);
        System.out.println(date);
        List<KiranaStore> transactions = kiranaStoreService.getTransactionsByDate(date);
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }
 @PostMapping
    public String createItem(@RequestBody KiranaStore kiranaStore){
        kiranaStoreService.createItem(kiranaStore);
        return " Item Added Successfully";
 }
 @PutMapping
    public String updateItem(@RequestBody KiranaStore kiranaStore){
        kiranaStoreService.updateItem(kiranaStore);
        return "Transaction Updated Successfully";
 }

 @DeleteMapping("{id}")
    public String deleteItem(@PathVariable("id") int id){
        kiranaStoreService.deleteItem(id);
        return "Transaction Deleted Successfully";
 }



}
