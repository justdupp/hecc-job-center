package com.hecc.cloud.config;


import com.google.common.cache.LoadingCache;
import org.springframework.stereotype.Component;

/**
 * @author xuhoujun
 * @description:
 * @date: created In 1:47 PM on 2019/10/19.
 */
@Component
public class CacheConfig {

    private LoadingCache<String, Object> loadingCache;

}
