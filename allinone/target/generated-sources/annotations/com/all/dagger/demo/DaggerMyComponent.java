package com.all.dagger.demo;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMyComponent implements MyComponent {
  private Provider<String> provideServerUrlProvider;

  private Provider<BackendService> provideBackendServiceProvider;

  private MembersInjector<Main> mainMembersInjector;

  private DaggerMyComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MyComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideServerUrlProvider =
        BackEndServiceModule_ProvideServerUrlFactory.create(builder.backEndServiceModule);

    this.provideBackendServiceProvider =
        DoubleCheck.provider(
            BackEndServiceModule_ProvideBackendServiceFactory.create(
                builder.backEndServiceModule, provideServerUrlProvider));

    this.mainMembersInjector = Main_MembersInjector.create(provideBackendServiceProvider);
  }

  @Override
  public BackendService provideBackendService() {
    return provideBackendServiceProvider.get();
  }

  @Override
  public void inject(Main main) {
    mainMembersInjector.injectMembers(main);
  }

  public static final class Builder {
    private BackEndServiceModule backEndServiceModule;

    private Builder() {}

    public MyComponent build() {
      if (backEndServiceModule == null) {
        this.backEndServiceModule = new BackEndServiceModule();
      }
      return new DaggerMyComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder userModule(UserModule userModule) {
      Preconditions.checkNotNull(userModule);
      return this;
    }

    public Builder backEndServiceModule(BackEndServiceModule backEndServiceModule) {
      this.backEndServiceModule = Preconditions.checkNotNull(backEndServiceModule);
      return this;
    }
  }
}
