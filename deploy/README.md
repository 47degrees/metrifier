# metrifier Deployment

In this section we are putting together all the scripts and descriptors in order to deploy both `HTTP` and `RPC` servers to [Google Cloud Platform](https://cloud.google.com/).

## Overview

This is a [Google Cloud Deployment Manager](https://cloud.google.com/deployment-manager/)
configuration file that deploys all the virtual machine instances needed to run `metrifier`.

## Deploy to GCP

Set your default project ID. Replace `[MY_PROJECT]` with your own project ID:

```bash
gcloud config set project [MY_PROJECT]
```

First of all, we have to make files writable, so assuming you are in the root of `metrifier` project you can run:

```bash
chmod 644 deploy/metrifier.yaml
chmod 644 deploy/*.jinja
```

Deploy the configuration:

```bash
gcloud deployment-manager deployments create metrifier-deployment --config deploy/metrifier.yaml
```

## Check your deployment's manifest

A manifest is a read-only file that describes the deployment's resources in detail. Deployment Manager creates the manifest and logs any errors or warnings that occurred during deployment, which makes the manifest useful for troubleshooting.

To look at your new deployment's manifest:

```bash
gcloud deployment-manager deployments describe metrifier-deployment
```

## Clean up

Once you are done, you might want to clean up the deployment:


```bash
gcloud deployment-manager deployments delete metrifier-deployment
```

Type `y` at the prompt:

```bash
The following deployments will be deleted:
- metrifier-deployment

Do you want to continue (y/N)?  y

Waiting for delete [operation-xxxx-xxxx-xxxxx-xxxxx]...done.
Delete operation operation-xxxxx-xxx-xxxx-xxxx completed successfully.
```

The deployment will be permanently deleted.