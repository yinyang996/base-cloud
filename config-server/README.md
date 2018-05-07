http://127.0.0.1:8020/user-center/test
http://127.0.0.1:8020/agent/test
```
{
	"name": "uc",
	"profiles": ["test"],
	"label": null,
	"version": "5a79aad82b885c173e9ce60698d077373607cd8e",
	"state": null,
	"propertySources": [{
		"name": "https://github.com/huoyan403/cloud-config.git/config-uc/uc-test.properties",
		"source": {
			"from": "git-test-1.0"
		}
	}, {
		"name": "https://github.com/huoyan403/cloud-config.git/config-uc/uc.properties",
		"source": {
			"from": "git-default-1.0"
		}
	}]
}
```