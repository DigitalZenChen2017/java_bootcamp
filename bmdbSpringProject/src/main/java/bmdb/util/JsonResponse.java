package bmdb.util;

import java.util.ArrayList;

public class JsonResponse {

	// set default values to null
	private Object data = null;
	private Object errors = null;
	private Object meta = null;

	// 3 constructors: Object, Exception, and String
	// Good response - single or multiple resource
	public JsonResponse(Object d) {
		data = d;
		meta = new ArrayList<>();
	}

	// 500 / error response
	public JsonResponse(Exception e) {
		errors = e;
	}

	// string constructor used
	public JsonResponse(String s) {
		errors = s;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	public Object getMeta() {
		return meta;
	}

	public void setMeta(Object meta) {
		this.meta = meta;
	}

	// 3 types of getInstance methods - Object, Exception, and String
	public static JsonResponse getInstance(Object d) {
		return new JsonResponse(d);
	}

	public static JsonResponse getInstance(Exception e) {
		return new JsonResponse(e);
	}

	//
	public static JsonResponse getInstance(String msg) {
		return new JsonResponse(msg);
	}
}