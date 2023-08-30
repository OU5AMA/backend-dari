package com.dari.Dari.dao;

import com.dari.Dari.model.Item;
import com.dari.Dari.model.enums.BuildingTypesEnum;
import com.dari.Dari.model.enums.ListOfCitiesEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.dari.Dari.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

//    find items by location(city)
    List<Item> findByCity(ListOfCitiesEnum city);

//    find items by price range
    List<Item> findByPriceBetween(double minPrice, double maxPrice);

//    find by house type
    List<Item> findByHouseType(BuildingTypesEnum houseType);

//    Find Items with a specific house part
    List<Item> findByHousePartAndHousePartValue(String housePart, int value);

//    Find Items by favorite status for a user
    List<Item> finByUserFavorites(User user, boolean isFavorite);


//    Custom Native SQL Query
//    N.B: you can use the custom query method just like any other method defined in the repository interface.
    @Query(value = "SELECT * FROM items WHERE price > :minPrice", nativeQuery = true)
    List<Item> findItemsAboveMinPrice(@Param("minPrice") double minPrice);


}
