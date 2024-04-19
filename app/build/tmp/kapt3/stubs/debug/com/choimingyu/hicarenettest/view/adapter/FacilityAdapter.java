package com.choimingyu.hicarenettest.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/choimingyu/hicarenettest/view/adapter/FacilityAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/choimingyu/hicarenettest/model/FacilityData;", "Lcom/choimingyu/hicarenettest/view/adapter/FacilityAdapter$FacilityViewHolder;", "onClick", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "FacilityViewHolder", "app_debug"})
public final class FacilityAdapter extends androidx.recyclerview.widget.ListAdapter<com.choimingyu.hicarenettest.model.FacilityData, com.choimingyu.hicarenettest.view.adapter.FacilityAdapter.FacilityViewHolder> {
    private final kotlin.jvm.functions.Function1<com.choimingyu.hicarenettest.model.FacilityData, kotlin.Unit> onClick = null;
    
    public FacilityAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.choimingyu.hicarenettest.model.FacilityData, kotlin.Unit> onClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.choimingyu.hicarenettest.view.adapter.FacilityAdapter.FacilityViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.choimingyu.hicarenettest.view.adapter.FacilityAdapter.FacilityViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006J\u0014\u0010\u000b\u001a\u00020\u0007*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/choimingyu/hicarenettest/view/adapter/FacilityAdapter$FacilityViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/choimingyu/hicarenettest/databinding/ItemFacilityBinding;", "onClick", "Lkotlin/Function1;", "Lcom/choimingyu/hicarenettest/model/FacilityData;", "", "(Lcom/choimingyu/hicarenettest/databinding/ItemFacilityBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "facility", "loadImage", "Landroid/widget/ImageView;", "imageUrl", "", "app_debug"})
    public static final class FacilityViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.choimingyu.hicarenettest.databinding.ItemFacilityBinding binding = null;
        private final kotlin.jvm.functions.Function1<com.choimingyu.hicarenettest.model.FacilityData, kotlin.Unit> onClick = null;
        
        public FacilityViewHolder(@org.jetbrains.annotations.NotNull()
        com.choimingyu.hicarenettest.databinding.ItemFacilityBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.choimingyu.hicarenettest.model.FacilityData, kotlin.Unit> onClick) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.choimingyu.hicarenettest.model.FacilityData facility) {
        }
        
        private final void loadImage(android.widget.ImageView $this$loadImage, java.lang.String imageUrl) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/choimingyu/hicarenettest/view/adapter/FacilityAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/choimingyu/hicarenettest/model/FacilityData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.choimingyu.hicarenettest.model.FacilityData> {
        @org.jetbrains.annotations.NotNull()
        public static final com.choimingyu.hicarenettest.view.adapter.FacilityAdapter.DiffCallback INSTANCE = null;
        
        private DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.choimingyu.hicarenettest.model.FacilityData oldItem, @org.jetbrains.annotations.NotNull()
        com.choimingyu.hicarenettest.model.FacilityData newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.choimingyu.hicarenettest.model.FacilityData oldItem, @org.jetbrains.annotations.NotNull()
        com.choimingyu.hicarenettest.model.FacilityData newItem) {
            return false;
        }
    }
}