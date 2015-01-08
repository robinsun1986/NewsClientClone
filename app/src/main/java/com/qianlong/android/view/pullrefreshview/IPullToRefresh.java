package com.qianlong.android.view.pullrefreshview;

import com.qianlong.android.view.pullrefreshview.PullToRefreshBase.OnRefreshListener;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;


/**
 * pull to refresh interface
 */
public interface IPullToRefresh<T extends View> {
    
    /**
     * @param pullRefreshEnabled
     */
    public void setPullRefreshEnabled(boolean pullRefreshEnabled);
    
    /**
     * @param pullLoadEnabled
     */
    public void setPullLoadEnabled(boolean pullLoadEnabled);
    
    /**
     * @param scrollLoadEnabled
     */
    public void setScrollLoadEnabled(boolean scrollLoadEnabled);
    
    /**
     */
    public boolean isPullRefreshEnabled();
    
    /**
     */
    public boolean isPullLoadEnabled();
    
    /**
     */
    public boolean isScrollLoadEnabled();
    
    /**
     */
    public void setOnRefreshListener(OnRefreshListener<T> refreshListener);
    
    /**
     *
     */
    public void onPullDownRefreshComplete();
    
    /**
     *
     */
    public void onPullUpRefreshComplete();
    
    /**
     */
    public T getRefreshableView();
    
    /**
     */
    public LoadingLayout getHeaderLoadingLayout();
    
    /**
     */
    public LoadingLayout getFooterLoadingLayout();
    
    /**
     */
    public void setLastUpdatedLabel(CharSequence label);
}
