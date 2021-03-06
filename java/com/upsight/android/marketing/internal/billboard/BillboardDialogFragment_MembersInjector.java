package com.upsight.android.marketing.internal.billboard;

import com.upsight.android.UpsightContext;
import com.upsight.android.marketing.internal.content.MarketingContentStore;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class BillboardDialogFragment_MembersInjector implements MembersInjector<BillboardDialogFragment> {
    static final /* synthetic */ boolean $assertionsDisabled = (!BillboardDialogFragment_MembersInjector.class.desiredAssertionStatus());
    private final Provider<MarketingContentStore> mContentStoreProvider;
    private final Provider<UpsightContext> mUpsightProvider;

    public BillboardDialogFragment_MembersInjector(Provider<UpsightContext> mUpsightProvider, Provider<MarketingContentStore> mContentStoreProvider) {
        if ($assertionsDisabled || mUpsightProvider != null) {
            this.mUpsightProvider = mUpsightProvider;
            if ($assertionsDisabled || mContentStoreProvider != null) {
                this.mContentStoreProvider = mContentStoreProvider;
                return;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public static MembersInjector<BillboardDialogFragment> create(Provider<UpsightContext> mUpsightProvider, Provider<MarketingContentStore> mContentStoreProvider) {
        return new BillboardDialogFragment_MembersInjector(mUpsightProvider, mContentStoreProvider);
    }

    public void injectMembers(BillboardDialogFragment instance) {
        if (instance == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        instance.mUpsight = (UpsightContext) this.mUpsightProvider.get();
        instance.mContentStore = (MarketingContentStore) this.mContentStoreProvider.get();
    }

    public static void injectMUpsight(BillboardDialogFragment instance, Provider<UpsightContext> mUpsightProvider) {
        instance.mUpsight = (UpsightContext) mUpsightProvider.get();
    }

    public static void injectMContentStore(BillboardDialogFragment instance, Provider<MarketingContentStore> mContentStoreProvider) {
        instance.mContentStore = (MarketingContentStore) mContentStoreProvider.get();
    }
}
