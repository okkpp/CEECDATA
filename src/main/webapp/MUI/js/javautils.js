//HashMap();
function HashMap() {
	//定义长度  
	var length = 0;
	//创建一个对象  
	var obj = new Object();

	/** 
	 * 判断Map是否为空 
	 */
	this.isEmpty = function() {
		return length == 0;
	};

	/** 
	 * 判断对象中是否包含给定Key 
	 */
	this.containsKey = function(key) {
		return (key in obj);
	};

	/** 
	 * 判断对象中是否包含给定的Value 
	 */
	this.containsValue = function(value) {
		for ( var key in obj) {
			if (obj[key] == value) {
				return true;
			}
		}
		return false;
	};

	/** 
	 *向map中添加数据 
	 */
	this.put = function(key, value) {
		if (!this.containsKey(key)) {
			length++;
		}
		obj[key] = value;
	};

	/** 
	 * 根据给定的Key获得Value 
	 */
	this.get = function(key) {
		return this.containsKey(key) ? obj[key] : null;
	};

	/** 
	 * 根据给定的Key删除一个值 
	 */
	this.remove = function(key) {
		if (this.containsKey(key) && (delete obj[key])) {
			length--;
		}
	};

	/** 
	 * 获得Map中的所有Value 
	 */
	this.values = function() {
		var _values = new Array();
		for ( var key in obj) {
			_values.push(obj[key]);
		}
		return _values;
	};

	/** 
	 * 获得Map中的所有Key 
	 */
	this.keySet = function() {
		var _keys = new Array();
		for ( var key in obj) {
			_keys.push(key);
		}
		return _keys;
	};

	/** 
	 * 获得Map的长度 
	 */
	this.size = function() {
		return length;
	};

	/** 
	 * 清空Map 
	 */
	this.clear = function() {
		length = 0;
		obj = new Object();
	};
}

//Set
function Set() {
	this.dataStore = [];
	this.add = add;//新增元素
	this.remove = remove;//删除元素
	this.size = size;//集合的元素个数
	this.union = union;//求并集
	this.contains = contains;//判断一个集合中是否包含某个元素
	this.intersect = intersect;//交集
	this.subset = subset;//判断一个集合是否是另一个的子集
	this.difference = difference;//求补集
	this.show = show;//将集合元素显示出来
}

function add(data) {
	if (this.dataStore.indexOf(data) < 0) {
		this.dataStore.push(data);
		return true;
	} else {
		return false;
	}
}

function remove(data) {
	var pos = this.dataStore.indexOf(data);
	if (pos > -1) {
		this.dataStore.splice(pos, 1);
		return true;
	} else {
		return false;
	}
}

function size() {
	return this.dataStore.length;
}

function show() {
	return "[" + this.dataStore + "]";
}

function contains(data) {
	if (this.dataStore.indexOf(data) > -1) {
		return true;
	} else {
		return false;
	}
}

function union(set) {
	var tempSet = new Set();
	for (var i = 0; i < this.dataStore.length; ++i) {
		tempSet.add(this.dataStore[i]);
	}
	for (var i = 0; i < set.dataStore.length; ++i) {
		if (!tempSet.contains(set.dataStore[i])) {
			tempSet.dataStore.push(set.dataStore[i]);
		}
	}
	return tempSet;
}

function intersect(set) {
	var tempSet = new Set();
	for (var i = 0; i < this.dataStore.length; ++i) {
		if (set.contains(this.dataStore[i])) {
			tempSet.add(this.dataStore[i]);
		}
	}
	return tempSet;
}

function subset(set) {
	if (this.size() > set.size()) {
		return false;
	} else {
		for ( var member in this.dataStore) {
			if (!set.contains(member)) {
				return false;
			}
		}
	}
	return true;
}

function difference(set) {
	var tempSet = new Set();
	for (var i = 0; i < this.dataStore.length; ++i) {
		if (!set.contains(this.dataStore[i])) {
			tempSet.add(this.dataStore[i]);
		}
	}
	return tempSet;
}