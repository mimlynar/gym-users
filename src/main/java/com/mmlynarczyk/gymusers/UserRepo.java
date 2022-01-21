package com.mmlynarczyk.gymusers;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepo extends PagingAndSortingRepository<User,Long> {
}
