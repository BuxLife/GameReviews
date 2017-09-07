package com.buxlife.gamereviews.Services;

/**
 * Created by Bux_Life on 2017/09/06.
 */
public interface BaseService<E, ID> {
   E save(E entity);
   E findById(ID id);
   E update(ID id);
}
