'use strict';

Object.defineProperty(exports, '__esModule', {value: true});

var d3Array = require('d3-array');
var d3Axis = require('d3-axis');
var d3Brush = require('d3-brush');
var d3Chord = require('d3-chord');
var d3Collection = require('d3-collection');
var d3Color = require('d3-color');
var d3Contour = require('d3-contour');
var d3Dispatch = require('d3-dispatch');
var d3Drag = require('d3-drag');
var d3Dsv = require('d3-dsv');
var d3Ease = require('d3-ease');
var d3Fetch = require('d3-fetch');
var d3Force = require('d3-force');
var d3Format = require('d3-format');
var d3Geo = require('d3-geo');
var d3Hierarchy = require('d3-hierarchy');
var d3Interpolate = require('d3-interpolate');
var d3Path = require('d3-path');
var d3Polygon = require('d3-polygon');
var d3Quadtree = require('d3-quadtree');
var d3Random = require('d3-random');
var d3Scale = require('d3-scale');
var d3ScaleChromatic = require('d3-scale-chromatic');
var d3Selection = require('d3-selection');
var d3Shape = require('d3-shape');
var d3Time = require('d3-time');
var d3TimeFormat = require('d3-time-format');
var d3Timer = require('d3-timer');
var d3Transition = require('d3-transition');
var d3Voronoi = require('d3-voronoi');
var d3Zoom = require('d3-zoom');

var version = "5.7.0";

Object.keys(d3Array).forEach(function (key) {
    exports[key] = d3Array[key];
});
Object.keys(d3Axis).forEach(function (key) {
    exports[key] = d3Axis[key];
});
Object.keys(d3Brush).forEach(function (key) {
    exports[key] = d3Brush[key];
});
Object.keys(d3Chord).forEach(function (key) {
    exports[key] = d3Chord[key];
});
Object.keys(d3Collection).forEach(function (key) {
    exports[key] = d3Collection[key];
});
Object.keys(d3Color).forEach(function (key) {
    exports[key] = d3Color[key];
});
Object.keys(d3Contour).forEach(function (key) {
    exports[key] = d3Contour[key];
});
Object.keys(d3Dispatch).forEach(function (key) {
    exports[key] = d3Dispatch[key];
});
Object.keys(d3Drag).forEach(function (key) {
    exports[key] = d3Drag[key];
});
Object.keys(d3Dsv).forEach(function (key) {
    exports[key] = d3Dsv[key];
});
Object.keys(d3Ease).forEach(function (key) {
    exports[key] = d3Ease[key];
});
Object.keys(d3Fetch).forEach(function (key) {
    exports[key] = d3Fetch[key];
});
Object.keys(d3Force).forEach(function (key) {
    exports[key] = d3Force[key];
});
Object.keys(d3Format).forEach(function (key) {
    exports[key] = d3Format[key];
});
Object.keys(d3Geo).forEach(function (key) {
    exports[key] = d3Geo[key];
});
Object.keys(d3Hierarchy).forEach(function (key) {
    exports[key] = d3Hierarchy[key];
});
Object.keys(d3Interpolate).forEach(function (key) {
    exports[key] = d3Interpolate[key];
});
Object.keys(d3Path).forEach(function (key) {
    exports[key] = d3Path[key];
});
Object.keys(d3Polygon).forEach(function (key) {
    exports[key] = d3Polygon[key];
});
Object.keys(d3Quadtree).forEach(function (key) {
    exports[key] = d3Quadtree[key];
});
Object.keys(d3Random).forEach(function (key) {
    exports[key] = d3Random[key];
});
Object.keys(d3Scale).forEach(function (key) {
    exports[key] = d3Scale[key];
});
Object.keys(d3ScaleChromatic).forEach(function (key) {
    exports[key] = d3ScaleChromatic[key];
});
Object.keys(d3Selection).forEach(function (key) {
    exports[key] = d3Selection[key];
});
Object.keys(d3Shape).forEach(function (key) {
    exports[key] = d3Shape[key];
});
Object.keys(d3Time).forEach(function (key) {
    exports[key] = d3Time[key];
});
Object.keys(d3TimeFormat).forEach(function (key) {
    exports[key] = d3TimeFormat[key];
});
Object.keys(d3Timer).forEach(function (key) {
    exports[key] = d3Timer[key];
});
Object.keys(d3Transition).forEach(function (key) {
    exports[key] = d3Transition[key];
});
Object.keys(d3Voronoi).forEach(function (key) {
    exports[key] = d3Voronoi[key];
});
Object.keys(d3Zoom).forEach(function (key) {
    exports[key] = d3Zoom[key];
});
exports.version = version;
Object.defineProperty(exports, "event", {
    get: function () {
        return d3Selection.event;
    }
});
