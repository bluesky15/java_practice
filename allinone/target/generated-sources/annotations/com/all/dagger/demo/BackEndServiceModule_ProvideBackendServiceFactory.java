package com.all.dagger.demo;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BackEndServiceModule_ProvideBackendServiceFactory
    implements Factory<BackendService> {
  private final BackEndServiceModule module;

  private final Provider<String> serverUrlProvider;

  public BackEndServiceModule_ProvideBackendServiceFactory(
      BackEndServiceModule module, Provider<String> serverUrlProvider) {
    assert module != null;
    this.module = module;
    assert serverUrlProvider != null;
    this.serverUrlProvider = serverUrlProvider;
  }

  @Override
  public BackendService get() {
    return Preconditions.checkNotNull(
        module.provideBackendService(serverUrlProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BackendService> create(
      BackEndServiceModule module, Provider<String> serverUrlProvider) {
    return new BackEndServiceModule_ProvideBackendServiceFactory(module, serverUrlProvider);
  }
}
