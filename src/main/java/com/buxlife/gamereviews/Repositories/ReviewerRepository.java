package com.buxlife.gamereviews.Repositories;

import com.buxlife.gamereviews.Domain.Reviewer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bux_Life on 2017/09/05.
 */
public interface ReviewerRepository extends CrudRepository<Reviewer, String> {
}
